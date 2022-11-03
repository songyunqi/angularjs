package com.nonvr.admin.domain;


import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_role")
@org.hibernate.annotations.Table(appliesTo = "t_role", comment = "角色信息")
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    @Comment("主键id")
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    @Comment("名称")
    private String name;
}