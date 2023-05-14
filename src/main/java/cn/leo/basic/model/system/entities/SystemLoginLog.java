package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import cn.leo.basic.model.system.base.Status;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "system_login_log")
@Table(name = "system_login_log")
public class SystemLoginLog extends BaseEntity {
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