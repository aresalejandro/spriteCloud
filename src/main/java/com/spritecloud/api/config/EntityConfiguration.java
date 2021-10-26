package com.spritecloud.api.config;

import com.spritecloud.services.*;

public enum EntityConfiguration {

    INVENTORY {
        @Override
        public Class<?> getEntityService() {
            return inventoryService.class;
        }

    },
    CREATELIST {
        @Override
        public Class<?> getEntityService() {
            return createListService.class;
        }

    },
    PUTUSERNAME {
        @Override
        public Class<?> getEntityService() {
            return putUserNameService.class;
        }

    },
    DELETEPETID {
        @Override
        public Class<?> getEntityService() {
            return deletePetIDService.class;
        }

    };

    public abstract Class<?> getEntityService();
}
