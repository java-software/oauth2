package com.software.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Demo_Null
 * @date 2020/10/26
 * @description 返回用户信息
 */
@RestController
public class GetUser {

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
