package com.group.inventory.role.model;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RoleEntity {

    @UtilityClass
    public static class Role {
        public static final String TABLE_NAME = "I_ROLE";
        public static final String NAME = "I_NAME";
        public static final String DESCRIPTION = "I_DESCRIPTION";
    }
}
