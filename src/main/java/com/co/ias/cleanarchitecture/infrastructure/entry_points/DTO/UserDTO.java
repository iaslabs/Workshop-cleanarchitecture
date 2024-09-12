package com.co.ias.cleanarchitecture.infrastructure.entry_points.DTO;

import com.co.ias.cleanarchitecture.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String email;

    public static UserDTO fromDomain(User user){
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    public User toDomain(){
        return new User(id, name, email);
    }

}
