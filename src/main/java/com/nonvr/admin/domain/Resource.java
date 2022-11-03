package com.nonvr.admin.domain;


import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_resource")
@org.hibernate.annotations.Table(appliesTo = "t_resource", comment = "资源信息")
public class Resource {

    @Id
    @Column(name = "id", nullable = false)
    @Comment("主键id")
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    @Comment("名称")
    private String name;

    @Column(name = "type", nullable = false)
    @Comment("类型")
    private Integer type;

    @Column(name = "img", length = 45)
    @Comment("图标")
    private String img;

    @Column(name = "url", length = 45)
    @Comment("url地址")
    private String url;

    @Column(name = "parent_id")
    @Comment("父级id")
    private Integer parentId;
}