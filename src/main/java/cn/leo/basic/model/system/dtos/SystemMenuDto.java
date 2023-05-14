package cn.leo.basic.model.system.dtos;

import cn.leo.basic.model.system.base.Status;
import cn.leo.basic.model.system.base.Type;
import cn.leo.basic.model.system.entities.SystemMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemMenu} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemMenuDto implements Serializable {
    private UUID id;
    private String name;
    private Type type;
    private String path;
    private String component;
    private String perms;
    private String icon;
    private Integer sortValue;
    private Status status;
    private Boolean isSelect;
    private SystemMenu parentId;
    private Set<SystemMenu> children = new LinkedHashSet<>();
}