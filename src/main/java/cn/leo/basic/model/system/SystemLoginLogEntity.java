package cn.leo.basic.model.system;

import cn.leo.basic.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="system_login_log_entity")
@Table(name = "system_login_log_entity")
public class SystemLoginLogEntity extends BaseEntity {
    @Column(name = "username"/*,columnDefinition = "用户账号"*/)
    private String username;

    @Column(name = "ip_address"/*,columnDefinition = "登录IP地址"*/)
    private String ipAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "status"/*,columnDefinition = "状态（1(NORMAL)正常 0(STOP)停用）"*/)
    private Status status;

    @Column(name = "message"/*,columnDefinition = "提示信息"*/)
    private String message;



}