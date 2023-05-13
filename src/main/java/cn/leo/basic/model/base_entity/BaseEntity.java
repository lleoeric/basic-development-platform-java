package cn.leo.basic.model.base_entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

//开启审计功能
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BaseEntity implements Serializable {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @CreatedBy
    private Long createUserId;
    @CreatedDate
    private Instant createTime;

    @LastModifiedBy
    private Long lastModifiedUserId;
    @LastModifiedDate
    private Instant lastModifiedTime;

    @Column(name = "is_deleted")
    private Boolean isDeleted;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BaseEntity that = (BaseEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}