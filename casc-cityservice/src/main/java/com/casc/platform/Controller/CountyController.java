package com.casc.platform.Controller;

import com.casc.platform.Service.CountyService;
import com.casc.platform.bean.County;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CountyController {

    @Autowired
    private CountyService countyService;

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
