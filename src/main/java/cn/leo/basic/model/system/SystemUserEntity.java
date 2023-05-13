package cn.leo.basic.model.system;

import cn.leo.base.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "system_user_entity")
public class SystemUserEntity extends BaseEntity {
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "head_url")
    private String headUrl;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "department_id")
    private SystemDepartmentEntity departmentId;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "post_id")
    private SystemPostEntity postId;

    @Column(name = "description")
    private String description;

    @Enumerated
    @Column(name = "status")
    private Status status;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<SystemRoleEntity> roleList = new ArrayList<>();

}