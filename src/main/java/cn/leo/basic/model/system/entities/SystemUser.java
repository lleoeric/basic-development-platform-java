package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import cn.leo.basic.model.system.base.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Entity(name = "system_user")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "system_user")
public class SystemUser extends BaseEntity {
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
    private SystemDepartment departmentId;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "post_id")
    private SystemPost postId;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<SystemRole> roleList = new ArrayList<>();



}