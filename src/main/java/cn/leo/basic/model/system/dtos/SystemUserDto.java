package cn.leo.basic.model.system.dtos;

import cn.leo.basic.model.system.base.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemUser} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemUserDto implements Serializable {
    private UUID id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String headUrl;
    private SystemDepartmentDto departmentId;
    private SystemPostDto postId;
    private String description;
    private Status status;
    private Collection<SystemRoleDto> roleList = new ArrayList<>();
}