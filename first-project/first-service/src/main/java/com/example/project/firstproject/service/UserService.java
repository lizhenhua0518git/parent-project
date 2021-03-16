package com.example.project.firstproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.firstproject.mapper.UserMapper;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.UserPageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser (Long id){
        return userMapper.selectById(id);
    }

    public Page getUserPage(UserPageRequest pageRequest){
        return userMapper.queryPage(pageRequest.toPage(),pageRequest);
    }
}
