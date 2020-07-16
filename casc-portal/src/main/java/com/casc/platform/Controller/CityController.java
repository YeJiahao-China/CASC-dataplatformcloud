package com.casc.platform.Controller;

import com.casc.platform.Service.CityService;
import com.casc.platform.bean.County;
import com.casc.platform.bean.NationalCity;
import com.casc.platform.bean.ProvinceCity;
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

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @ResponseBody
    @RequestMapping("/cityRanking/nationalCity/queryPage")
    public JSONObject nationalCityQuerypage(int pageno, int pagesize, String queryText, HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        String username = (String)application.getAttribute("username");
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("pageno", pageno);
        paramMap.put("pagesize", pagesize);
        paramMap.put("queryText", queryText);
        Page<NationalCity> page = cityService.queryNationalCity(paramMap);
        List<NationalCity> datas = page.getDatas();
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


    @RequestMapping("/casc/cityRanking/nationalCity")
    public String nationalCityIndex(){
        return "city/nationalCity";
    }

    @ResponseBody
    @RequestMapping("/cityRanking/provinceCity/queryPage")
    public JSONObject provinceCityQuerypage(int pageno, int pagesize, String queryText, HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        String username = (String)application.getAttribute("username");
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("pageno", pageno);
        paramMap.put("pagesize", pagesize);
        paramMap.put("queryText", queryText);
        Page<ProvinceCity> page = cityService.queryProvinceCity(paramMap);
        List<ProvinceCity> datas = page.getDatas();
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


    @RequestMapping("casc/cityRanking/provinceCity")
    public String provinceCityIndex(){
        return "city/provinceCity";
    }

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
