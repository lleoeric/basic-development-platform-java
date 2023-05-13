package cn.leo.basic.model.system;

import cn.leo.base.model.base_entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "system_login_log_entity")
public class SystemLoginLogEntity extends BaseEntity {
    @Column(name = "username",columnDefinition = "用户账号")
    private String username;

    @Column(name = "ip_address",columnDefinition = "登录IP地址")
    private String ipAddress;

    @Enumerated
    @Column(name = "status",columnDefinition = "状态（1(NORMAL)正常 0(STOP)停用）")
    private Status status;

    @Column(name = "message",columnDefinition = "提示信息")
    private String message;



}