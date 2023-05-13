package cn.leo.basic.model.base_entity;

import lombok.NonNull;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
import java.util.UUID;

public class MyAuditorAware implements AuditorAware<UUID> {
    @Override
    public @NonNull Optional<UUID> getCurrentAuditor() {

        /**
         * 需要整合spring security时写
         * TODO
         */
        return Optional.of(UUID.randomUUID());
    }
}
