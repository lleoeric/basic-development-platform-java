package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Entity(name = "system_role")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "system_role")
public class SystemRole extends BaseEntity {
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
    private Collection<SystemUser> userList = new ArrayList<>();

}