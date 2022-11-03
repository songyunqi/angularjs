package com.nonvr.admin.domain.repository;

import com.nonvr.admin.domain.SubjectRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRoleRepository extends JpaRepository<SubjectRole, Integer> {
    @Query(value = "select a.name from t_role a " +
            "left join t_subject_role b on a.id = b.role_id " +
            "left join t_user_info c on c.id = b.subject_id " +
            "where c.id = :userId and c.delete_flag = 0 ", nativeQuery = true)
    List<String> queryRoleByUserId(@Param("userId") Long userId);
}