package com.casc.platform.Controller;

import com.casc.platform.Service.CountyService;
import com.casc.platform.Service.NationalCityService;
import com.casc.platform.Service.ProvinceCityService;
import com.casc.platform.bean.County;
import com.casc.platform.bean.NationalCity;
import com.casc.platform.bean.ProvinceCity;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CityController {

    @Autowired
    private CountyService countyService;
    @Autowired
    private ProvinceCityService provinceCityService;
    @Autowired
    private NationalCityService nationalCityService;

    @RequestMapping("cityRanking/nationalCity/queryPage")
    Page<NationalCity> queryNationalCity(@RequestBody Map<String, Object> paramMap){
        Page<NationalCity> page =  nationalCityService.queryNationalCity(paramMap);
        return page;
    }

    @RequestMapping("cityRanking/provinceCity/queryPage")
    Page<ProvinceCity> queryProvinceCity(@RequestBody Map<String, Object> paramMap){
        Page<ProvinceCity> page = provinceCityService.queryProvinceCity(paramMap);
        List<ProvinceCity> datas = page.getDatas();
        System.out.println(datas.size());
        for (int i = 0; i < datas.size(); i++) {
            System.out.println(datas.get(i).getCityname());
        }
        return page;
    }


    @RequestMapping("cityRanking/countyRanking/queryPage")
    Page<County> queryCounty(@RequestBody Map<String, Object> paramMap){
        Page<County> page = countyService.queryCounty(paramMap);
        List<County> datas = page.getDatas();
        System.out.println("controller层"+datas.size());
        for (int i = 0; i <datas.size() ; i++) {
            System.out.println("controller层"+datas.get(i).getArea());
        }
        page.getTotalsize();
        return  page;
    }
}
