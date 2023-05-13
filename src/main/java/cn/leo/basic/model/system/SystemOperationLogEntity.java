package cn.leo.basic.model.system;

import cn.leo.base.model.base_entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "system_operation_log_entity")
public class SystemOperationLogEntity extends BaseEntity {
    @Column(name = "title")
    private String title;

    @Enumerated
    @Column(name = "business_type")
    private BusinessType businessType;

    @Column(name = "method")
    private String method;

    @Column(name = "request_method")
    private String requestMethod;

    @Enumerated
    @Column(name = "operator_type")
    private OperatorType operatorType;

    @Column(name = "operator_name")
    private String operatorName;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "department_id_id")
    private SystemDepartmentEntity departmentId;

    @Column(name = "operator_url")
    private String operatorUrl;

    @Column(name = "operator_ip")
    private String operatorIp;

    @Column(name = "operator_param")
    private String operatorParam;

    @Column(name = "json_result")
    private String jsonResult;

    @Enumerated
    @Column(name = "status")
    private Status status;

    @Column(name = "error_message")
    private String errorMessage;


    enum OperatorType{
        OTHER_USER(0),
        BACK_USER(1),
        PHONE_USER(2);

        OperatorType(int i) {


        }
    }
    enum BusinessType {
        OTHER(0),
        ADD(1),
        UPDATE(2),
        DELETE(3),
        ;

        BusinessType(int i) {

        }
    }
}