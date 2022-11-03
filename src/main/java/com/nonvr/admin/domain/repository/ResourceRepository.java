package com.nonvr.admin.domain.repository;


import com.nonvr.admin.domain.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}