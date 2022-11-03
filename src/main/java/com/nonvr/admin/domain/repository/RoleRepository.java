package com.nonvr.admin.domain.repository;


import com.nonvr.admin.domain.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query(value = "from Role t where t.name like %:name% or :name is null")
    Page<Role> searchRole(@Param("name") String name, Pageable pageable);
}