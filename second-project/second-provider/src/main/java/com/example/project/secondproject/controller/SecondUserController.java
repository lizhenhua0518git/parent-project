package com.example.project.secondproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.PageRequest;
import com.example.project.projectcommon.request.UserPageRequest;
import com.example.project.secondproject.service.SecondUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user1")
@RestController
public class SecondUserController {

    @Autowired
    private SecondUserService secondUserService;
    @GetMapping("{id}")
    public User getUser(@PathVariable Long id){
        return secondUserService.getUser(id);
    }

    @PostMapping("page")
    public Page getUserPage(@RequestBody UserPageRequest pageRequest){
        return secondUserService.getUserPage(pageRequest);
    }
}
