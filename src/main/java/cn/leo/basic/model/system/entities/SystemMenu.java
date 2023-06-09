package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import cn.leo.basic.model.system.base.Status;
import cn.leo.basic.model.system.base.Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "system_menu")
@Table(name = "system_menu")
@Builder
public class SystemMenu extends BaseEntity {
    @Column(name = "name"/*, columnDefinition = "名称"*/)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type"/*, columnDefinition = "类型(1:菜单,2:按钮)"*/)
    private Type type;

    @Column(name = "path"/*, columnDefinition = "路由地址"*/)
    private String path;

    @Column(name = "component"/*, columnDefinition = "组件路径"*/)
    private String component;

    @Column(name = "perms"/*, columnDefinition = "权限标识"*/)
    private String perms;

    @Column(name = "icon"/*, columnDefinition = "图标"*/)
    private String icon;

    @Column(name = "sort_value"/*, columnDefinition = "排序"*/)
    private Integer sortValue;

    @Enumerated(EnumType.STRING)
    @Column(name = "status"/*, columnDefinition = "状态(0:禁止,1:正常)"*/)
    private Status status;

    @Column(name = "is_select"/*, columnDefinition = "是否选中"*/)
    private Boolean isSelect;

    @ManyToOne
    @JoinColumn(name = "parent_id"/*, columnDefinition = "上级菜单"*/)
    private SystemMenu parentId;

    @OneToMany(mappedBy = "parentId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SystemMenu> children = new LinkedHashSet<>();


}