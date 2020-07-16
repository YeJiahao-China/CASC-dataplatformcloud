package com.casc.platform.Service;

import com.casc.platform.bean.County;
import com.casc.platform.bean.NationalCity;
import com.casc.platform.bean.ProvinceCity;
import com.casc.platform.util.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient("casc-cityservice")
public interface CityService {

    @RequestMapping("cityRanking/countyRanking/queryPage")
    Page<County> queryCounty(@RequestBody Map<String, Object> paramMap);

    @RequestMapping("cityRanking/provinceCity/queryPage")
    Page<ProvinceCity> queryProvinceCity(@RequestBody Map<String, Object> paramMap);

    @RequestMapping("cityRanking/nationalCity/queryPage")
    Page<NationalCity> queryNationalCity(@RequestBody Map<String, Object> paramMap);
}
