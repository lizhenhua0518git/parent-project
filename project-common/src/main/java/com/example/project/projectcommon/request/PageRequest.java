package com.example.project.projectcommon.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
public class PageRequest {


    private Long currPageNum = 1L;
    private Long pageSize = 10L;

    public <T> Page<T> toPage() {
        return new Page<T>(currPageNum, pageSize);
    }
}
