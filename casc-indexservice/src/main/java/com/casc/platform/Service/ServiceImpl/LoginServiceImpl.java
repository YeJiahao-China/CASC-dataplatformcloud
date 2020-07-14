package com.casc.platform.Service.ServiceImpl;

import com.casc.platform.Dao.LoginDao;
import com.casc.platform.Service.LoginService;
import com.casc.platform.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean doLogin(HashMap<String, String> paramMap) {
        User user = loginDao.doLogin(paramMap);
        return user == null ? false : true;
    }

    @Override
    public User queryUser(HashMap<String, String> paramMap) {
        User user = loginDao.queryUser(paramMap);
        return user;
    }
}
