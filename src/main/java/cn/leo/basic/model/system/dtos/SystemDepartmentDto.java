package cn.leo.basic.model.system.dtos;

import cn.leo.basic.model.system.base.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemDepartment} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemDepartmentDto extends RepresentationModel<SystemDepartmentDto> implements Serializable {
    private UUID id;
    private String name;
    private String treePath;
    private Integer sortValue;
    private String leader;
    private String phone;
    private Status status;
    private ParentSystemDepartmentDto parent;
    private List<ChildrenSystemDepartmentDto> children = new ArrayList<>();

    /**
     * A DTO for the {@link cn.leo.basic.model.system.entities.SystemDepartment} entity
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Accessors(chain = true)
    public static class ParentSystemDepartmentDto implements Serializable {
        private UUID id;
        private String name;
        private String treePath;
        private Integer sortValue;
        private String leader;
        private String phone;
        private Status status;
    }

    /**
     * A DTO for the {@link cn.leo.basic.model.system.entities.SystemDepartment} entity
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Accessors(chain = true)
    public static class ChildrenSystemDepartmentDto implements Serializable {
        private UUID id;
        private String name;
        private String treePath;
        private Integer sortValue;
        private String leader;
        private String phone;
        private Status status;
    }
}