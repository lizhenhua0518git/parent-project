package com.example.project.secondproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.PageRequest;
import com.example.project.projectcommon.request.UserPageRequest;
import org.apache.ibatis.annotations.Param;


public interface SecondUserMapper extends BaseMapper<User> {
    Page queryPage(Page page, @Param("pageQo") UserPageRequest pageRequest);
}
