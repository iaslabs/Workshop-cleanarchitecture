package com.co.ias.cleanarchitecture.infrastructure.entry_points;

import java.util.List;
import java.util.stream.Stream;

import com.co.ias.cleanarchitecture.domain.model.User;
import com.co.ias.cleanarchitecture.infrastructure.driven_adapters.DBO.UserDBO;
import com.co.ias.cleanarchitecture.domain.usecase.UserUseCase;
import com.co.ias.cleanarchitecture.infrastructure.entry_points.DTO.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserEntryPoint {

    private final UserUseCase userUseCase;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO){
        User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
        String message = userUseCase.createUser(user);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getusers(){
        List<UserDTO> users = userUseCase.getUsers()
                                         .stream()
                                         .map(user -> new UserDTO(user.getId(), user.getName(),
                                                                          user.getEmail())).toList();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
