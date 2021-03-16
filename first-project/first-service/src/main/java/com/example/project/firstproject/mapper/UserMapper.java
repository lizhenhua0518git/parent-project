package com.example.project.firstproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.project.projectcommon.pojo.User;
import com.example.project.projectcommon.request.UserPageRequest;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    Page queryPage(Page page, @Param("pageQo") UserPageRequest pageRequest);

}
