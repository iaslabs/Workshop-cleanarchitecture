package com.co.ias.cleanarchitecture.infrastructure.entry_points.DTO;

import com.co.ias.cleanarchitecture.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String email;

}
