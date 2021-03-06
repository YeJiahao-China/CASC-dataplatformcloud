package com.casc.platform.Controller;

import com.casc.platform.Service.LoginService;
import com.casc.platform.bean.User;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/casc/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session != null)
            session.invalidate();
        return "redirect:/casc/login";
    }

    @RequestMapping("casc/login")
    public String login() {
        return "login";
    }

    @RequestMapping("casc/doLogin")
    @ResponseBody
    public String doLogin(String tel, String password, HttpServletRequest request) {
        System.out.println("tel == " + tel + "password == " + password);
        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("tel", tel);
        paramMap.put("password", password);
        boolean res = false;
        User user = loginService.queryUser(paramMap);
        if (user != null)
            res = true;
        if (res) {
            ServletContext application = request.getServletContext();
            application.setAttribute("username", user.getUsername());
        }
        JSONObject jsonObject = new JSONObject();
        try {
            if (res)
                jsonObject.put("res", "true");
            else
                jsonObject.put("res", "false");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jsonString = jsonObject.toString();
        return jsonString;
    }

    @RequestMapping("casc/loginsuccess")
    public String loginSuccess() {
        return "index";
    }

}
