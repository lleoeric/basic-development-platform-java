package cn.leo.basic.model.system;

import cn.leo.base.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "system_department_entity")
public class SystemDepartmentEntity extends BaseEntity {
    @Column(name = "name",columnDefinition = "部门名称")
    private String name;



    @Column(name = "tree_path",columnDefinition = "树结构")
    private String treePath;

    @Column(name = "sort_value",columnDefinition = "排序")
    private Integer sortValue;

    @Column(name = "leader",columnDefinition = "负责人")
    private String leader;

    @Column(name = "phone",columnDefinition = "电话")
    private String phone;

    @Enumerated
    @Column(name = "status",columnDefinition = "状态（1(NORMAL)正常 0(STOP)停用）")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "parent_id",columnDefinition = "父节点id")
    private SystemDepartmentEntity parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SystemDepartmentEntity> children = new ArrayList<>();


}