package com.casc.platform.Controller;

import com.casc.platform.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("doLogin")
    public boolean doLogin(@RequestBody HashMap<String,String> paramMap){
        boolean res = loginService.doLogin(paramMap);
        return res;
    }
}
