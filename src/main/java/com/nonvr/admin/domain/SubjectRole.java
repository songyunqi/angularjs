package com.nonvr.admin.domain;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_subject_role")
@org.hibernate.annotations.Table(appliesTo = "t_subject_role", comment = "主体与角色对应关系")
public class SubjectRole {

    @Id
    @Column(name = "id", nullable = false)
    @Comment("主键id")
    private Long id;

    @Column(name = "subject_id", nullable = false)
    @Comment("主体id")
    private Long subjectId;

    @Column(name = "subject_type", nullable = false)
    @Comment("主体类别")
    private Integer subjectType;

    @Column(name = "role_id", nullable = false)
    @Comment("角色id")
    private Long roleId;
}