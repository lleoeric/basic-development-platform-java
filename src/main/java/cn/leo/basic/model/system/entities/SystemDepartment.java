package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import cn.leo.basic.model.system.base.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "system_department")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "system_department", indexes = {
        @Index(name = "idx_departmentalisation", columnList = "parent_id")
})
@Builder
public class SystemDepartment extends BaseEntity {

    @Column(name = "name"/*, columnDefinition = "部门名称"*/)
    private String name;

    @Column(name = "tree_path"/*, columnDefinition = "树结构"*/)
    private String treePath;

    @Column(name = "sort_value"/*, columnDefinition = "排序"*/)
    private Integer sortValue;

    @Column(name = "leader"/*, columnDefinition = "负责人"*/)
    private String leader;

    @Column(name = "phone"/*, columnDefinition = "电话"*/)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status"/*, columnDefinition = "状态（1(NORMAL)正常 0(STOP)停用）"*/)
    private Status status;

    @JsonIgnore
    @ManyToOne
    private SystemDepartment parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    @OrderBy(value = "sortValue ASC")
    @JsonIgnore
    private List<SystemDepartment> children = new ArrayList<>();


}