package com.wsmhz.security.resource.service.api.domain.form;

import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * Created By TangBiJing On 2019/5/13
 * Description:
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsernameForm {

    @NotBlank(message = "username不能为空")
    private String username;
}
