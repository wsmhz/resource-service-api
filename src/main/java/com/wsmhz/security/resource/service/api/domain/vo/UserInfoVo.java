package com.wsmhz.security.resource.service.api.domain.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * create by tangbj on 2018/5/21
 */
@Setter
@Getter
public class UserInfoVo {
    private Long id;

    private String username;

    private Boolean status;

    private String email;

    private String phone;

    private Integer role;
}
