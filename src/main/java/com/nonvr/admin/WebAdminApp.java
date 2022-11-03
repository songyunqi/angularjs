package com.nonvr.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@Controller
public class WebAdminApp {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminApp.class, args);
    }

    @RequestMapping("index")
    public String idx() {
        return "index";
    }

    @RequestMapping("index3.html")
    public String idx3() {
        return "index3";
    }

    @RequestMapping("index-test")
    public String indexTest() {
        return "index-test";
    }

    @RequestMapping("partial1")
    public String partial1() {
        return "partials/partial1";
    }

    @RequestMapping("partial2")
    public String partial2() {
        return "partials/partial2";
    }

    @RequestMapping("resource")
    public String resource() {
        return "resource/menu-resource";
    }

    @RequestMapping("role/man.html")
    public String roleMan() {
        return "role/role-man";
    }

    @RequestMapping("login-page")
    public String loginPage() {
        return "login";
    }
}
