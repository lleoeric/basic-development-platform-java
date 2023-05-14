package cn.leo.basic.model.system.dtos;

import cn.leo.basic.model.system.base.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemLoginLog} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemLoginLogDto implements Serializable {
    private UUID id;
    private String username;
    private String ipAddress;
    private Status status;
    private String message;
}