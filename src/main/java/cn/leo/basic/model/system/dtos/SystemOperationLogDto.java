package cn.leo.basic.model.system.dtos;

import cn.leo.basic.model.system.base.BusinessType;
import cn.leo.basic.model.system.base.OperatorType;
import cn.leo.basic.model.system.base.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link cn.leo.basic.model.system.entities.SystemOperationLog} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemOperationLogDto implements Serializable {
    private UUID id;
    private String title;
    private BusinessType businessType;
    private String method;
    private String requestMethod;
    private OperatorType operatorType;
    private String operatorName;
    private SystemDepartmentDto departmentId;
    private String operatorUrl;
    private String operatorIp;
    private String operatorParam;
    private String jsonResult;
    private Status status;
    private String errorMessage;
}