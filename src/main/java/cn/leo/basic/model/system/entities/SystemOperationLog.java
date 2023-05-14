package cn.leo.basic.model.system.entities;

import cn.leo.basic.model.base_entity.BaseEntity;
import cn.leo.basic.model.system.base.BusinessType;
import cn.leo.basic.model.system.base.OperatorType;
import cn.leo.basic.model.system.base.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity(name ="system_operation_log")
@Table(name = "system_operation_log")
public class SystemOperationLog extends BaseEntity {
    @Column(name = "title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "business_type")
    private BusinessType businessType;

    @Column(name = "method")
    private String method;

    @Column(name = "request_method")
    private String requestMethod;

    @Enumerated(EnumType.STRING)
    @Column(name = "operator_type")
    private OperatorType operatorType;

    @Column(name = "operator_name")
    private String operatorName;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "department_id_id")
    private SystemDepartment departmentId;

    @Column(name = "operator_url")
    private String operatorUrl;

    @Column(name = "operator_ip")
    private String operatorIp;

    @Column(name = "operator_param")
    private String operatorParam;

    @Column(name = "json_result")
    private String jsonResult;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "error_message")
    private String errorMessage;




}