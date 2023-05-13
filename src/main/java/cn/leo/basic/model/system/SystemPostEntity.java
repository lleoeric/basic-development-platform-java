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
@Entity(name = "system_post_entity")
@Table(name = "system_post_entity")
public class SystemPostEntity extends BaseEntity {

    @Column(name = "post_code"/*,columnDefinition = "岗位编码"*/)
    private String postCode;

    @Column(name = "name"/*,columnDefinition = "岗位名称"*/)
    private String name;

    @Column(name = "description"/*,columnDefinition = "显示顺序"*/)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status"/*,columnDefinition = "状态（1正常 0停用）"*/)
    private Status status;

}