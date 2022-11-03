package com.nonvr.admin.domain;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_subject_resource")
@org.hibernate.annotations.Table(appliesTo = "t_subject_resource", comment = "主体与资源对应关系")
public class SubjectResource {

    @Id
    @Column(name = "id", nullable = false)
    @Comment("主键id")
    private Long id;

    @Column(name = "subject_id", nullable = false)
    @Comment("主体id,角色id")
    private Integer subjectId;

    @Column(name = "resource_id", nullable = false)
    @Comment("资源id")
    private Integer resourceId;

    @Column(name = "subject_type")
    @Comment("资源类型")
    private Integer subjectType;
}