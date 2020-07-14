package com.casc.platform.Service;

import com.casc.platform.bean.User;

import java.util.HashMap;

public interface LoginService {
    boolean doLogin(HashMap<String, String> paramMap);

    User queryUser(HashMap<String, String> paramMap);
}
