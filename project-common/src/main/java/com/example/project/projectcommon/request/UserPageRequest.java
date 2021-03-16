package com.example.project.projectcommon.request;

import lombok.Data;

@Data
public class UserPageRequest extends PageRequest {
    private String name;
}
