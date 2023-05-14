package cn.leo.basic.model.system.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemRole} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemRoleDto extends RepresentationModel<SystemRoleDto> implements Serializable {
    private UUID id;
    private String roleName;
    private String roleCode;
    private String description;
    private Collection<SystemUserDto> userList = new ArrayList<>();
}