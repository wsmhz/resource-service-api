package com.wsmhz.security.resource.service.api.api;

import com.wsmhz.security.resource.service.api.domain.form.UserRegisterForm;
import com.wsmhz.security.resource.service.api.domain.form.UsernameForm;
import com.wsmhz.security.resource.service.api.domain.vo.LoginUserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * Created By TangBiJing On 2019/5/13
 * Description:
 */
@FeignClient("resource-service")
public interface UserApi {

    @PostMapping("/select")
    LoginUserVo selectByUsername(@RequestBody @Valid UsernameForm usernameForm);

    @PostMapping("/insert")
    boolean insert(@RequestBody @Valid UserRegisterForm userRegisterForm);
}
