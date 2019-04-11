package com.smarthouse.commonutil.data_transfer_objects;

import com.smarthouse.commonutil.entities.User;

public class DTOUtil {

    public static User getUserFromDto(UserDTO userDTO) {
        User result = new User();
        result.setName(userDTO.getName());
        result.setEmail(userDTO.getEmail());
        result.setPassword(userDTO.getPassword());
        result.setPhoneNumber(userDTO.getPhoneNumber());
        return result;
    }

}
