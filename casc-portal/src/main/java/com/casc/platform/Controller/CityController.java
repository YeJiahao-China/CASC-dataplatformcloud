package com.casc.platform.Controller;

import com.alibaba.fastjson.JSON;
import com.casc.platform.Service.CityService;
import com.casc.platform.bean.County;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("casc/cityRanking/countyRanking")
    public String cityRanking() {
        return "city/countyRanking";
    }


    @ResponseBody
    @RequestMapping("/cityRanking/countyRanking/queryPage")
    public JSONObject countyRankingQuerypage(int pageno, int pagesize, String queryText, HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        String username = (String)application.getAttribute("username");
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("pageno", pageno);
        paramMap.put("pagesize", pagesize);
        paramMap.put("queryText", queryText);
        Page<County> page = cityService.queryCounty(paramMap);
        List<County> datas = page.getDatas();
        int pageTotalsize = page.getTotalsize();
        int pagePageno = page.getPageno();
        int pagePagesize = page.getPagesize();
        int startindex = page.getStartindex();
        int totalno = page.getTotalno();
        String datsJson = JSONObject.toJSONString(datas);
        JSONObject jsonObject = new JSONObject();
        try {
            if (page != null) {
                jsonObject.put("success", "true");
                jsonObject.put("data", datsJson);
                jsonObject.put("pagePageno", pagePageno);
                jsonObject.put("pagePagesize", pagePagesize);
                jsonObject.put("startindex", startindex);
                jsonObject.put("totalno", totalno);
                jsonObject.put("pageTotalsize", pageTotalsize);
                jsonObject.put("username",username);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

}
