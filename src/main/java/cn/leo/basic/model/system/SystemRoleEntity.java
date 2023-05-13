package cn.leo.basic.model.system;

import cn.leo.base.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "system_role_entity")
public class SystemRoleEntity extends BaseEntity {
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Collection<SystemUserEntity> userList = new ArrayList<>();

}