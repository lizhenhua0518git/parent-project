package com.example.project.firstproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.firstproject.service.UserService;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.UserPageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("page")
    public Page getUserPage(@RequestBody UserPageRequest pageRequest){
        return userService.getUserPage(pageRequest);
    }
}
