package com.group.inventory.user.dto;

import com.group.inventory.user.model.UserStatus;
import com.group.inventory.user.validation.annotation.UniqueEmail;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private UUID id;

    private String username;

    @UniqueEmail
    private String email;

    private String password;

    private String avatar;

    private UserStatus status;
}
