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
@Table(name = "system_post_entity")
public class SystemPostEntity extends BaseEntity {
    @Column(name = "post_code",columnDefinition = "岗位编码")
    private String postCode;

    @Column(name = "name",columnDefinition = "岗位名称")
    private String name;

    @Column(name = "description",columnDefinition = "显示顺序")
    private String description;

    @Enumerated
    @Column(name = "status",columnDefinition = "状态（1正常 0停用）")
    private Status status;

}