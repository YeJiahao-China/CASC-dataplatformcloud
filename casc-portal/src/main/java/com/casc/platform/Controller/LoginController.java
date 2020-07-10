package com.casc.platform.Controller;

import com.casc.platform.Service.LoginService;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("casc/login")
    public String login(){
        return "login";
    }

    @RequestMapping("casc/doLogin")
    @ResponseBody
    public String doLogin(String tel,String password) {
        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("tel",tel);
        paramMap.put("password",password);
        boolean res = loginService.doLogin(paramMap);
        JSONObject jsonObject = new JSONObject();
        try{
            if(res)
                jsonObject.put("res","true");
            else
                jsonObject.put("res","false");
        }catch (JSONException e){
            e.printStackTrace();
        }
        String jsonString = jsonObject.toString();
        return jsonString;
    }

    @RequestMapping("casc/loginsuccess")
    public String loginSuccess(){
        return "index";
    }
}
