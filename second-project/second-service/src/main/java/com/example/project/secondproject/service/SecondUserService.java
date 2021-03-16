package com.example.project.secondproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.PageRequest;
import com.example.project.projectcommon.request.UserPageRequest;
import com.example.project.secondproject.mapper.SecondUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondUserService {

    @Autowired
    private SecondUserMapper secondUserMapper;
    public User getUser(Long id){
        return secondUserMapper.selectById(id);
    }
    public Page getUserPage(UserPageRequest pageRequest){
       return secondUserMapper.queryPage(pageRequest.toPage(),pageRequest);
    }
}
