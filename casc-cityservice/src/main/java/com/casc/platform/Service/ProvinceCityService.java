package com.casc.platform.Service;

import com.casc.platform.bean.ProvinceCity;
import com.casc.platform.util.Page;

import java.util.Map;

public interface ProvinceCityService {
    Page<ProvinceCity> queryProvinceCity(Map<String, Object> paramMap);
}
