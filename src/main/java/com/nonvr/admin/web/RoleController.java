package com.nonvr.admin.web;


import com.nonvr.admin.domain.repository.RoleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RoleController {

    @Resource
    RoleRepository roleRepository;

    @GetMapping("role/manage")
    public String manage() {
        return "partials/role/manage";
    }

    @GetMapping("role/list")
    @ResponseBody
    public Page<?> list(String name, Pageable pageRequest) {
        return roleRepository.searchRole(name, pageRequest);
    }
}
