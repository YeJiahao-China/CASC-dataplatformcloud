package com.casc.platform.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {

    @RequestMapping("casc/cityRanking/countyRanking")
    public String cityRanking(){
        return "city/countyRanking";
    }
}
