package com.wsmhz.security.resource.service.api.domain.vo;

import lombok.*;

/**
 * Created By TangBiJing On 2019/5/13
 * Description:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginUserVo {

    private Long id;

    private String username;

    private String password;

    private Boolean status;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;


}
