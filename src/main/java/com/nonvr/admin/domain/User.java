package com.nonvr.admin.domain;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_user")
@org.hibernate.annotations.Table(appliesTo = "t_user", comment = "用户信息")
public class User {

    @Id
    @Column(name = "id", nullable = false, length = 45)
    @Comment("主键id")
    private Long id;

    @Column(name = "username", length = 45)
    @Comment("用户名")
    private String username;

    @Column(name = "password", length = 200)
    @Comment("密码")
    private String password;

    @Column(name = "mp_open_id", length = 200)
    @Comment("小程序openid")
    private String mpOpenId;

    @Column(name = "unionid", length = 200)
    @Comment("unionid")
    private String unionid;

    @Column(name = "public_open_id", length = 200)
    @Comment("公众号openid")
    private String publicOpenId;

    @Column(name = "nick_name", length = 100)
    @Comment("昵称")
    private String nickName;

    @Column(name = "gender")
    @Comment("性别")
    private Integer gender;

    @Column(name = "language", length = 45)
    @Comment("语言")
    private String language;

    @Column(name = "province", length = 45)
    @Comment("省")
    private String province;

    @Column(name = "city", length = 45)
    @Comment("市")
    private String city;

    @Column(name = "country", length = 45)
    @Comment("区县")
    private String country;

    @Column(name = "avatar_url", length = 200)
    @Comment("头像")
    private String avatarUrl;

    @Column(name = "mobile", length = 45)
    @Comment("mobile手机")
    private String mobile;
}