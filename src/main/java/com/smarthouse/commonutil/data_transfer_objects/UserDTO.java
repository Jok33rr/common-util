package com.smarthouse.commonutil.data_transfer_objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Long roleId;
}
