package com.nonvr.admin.domain.repository;


import com.nonvr.admin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByMpOpenId(String openid);

    User findByUnionid(String unionid);

    User findByUsername(String username);

    User findByMobile(String mobile);
}