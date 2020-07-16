package com.casc.platform.Service;

import com.casc.platform.bean.NationalCity;
import com.casc.platform.util.Page;

import java.util.Map;

public interface NationalCityService {
    Page<NationalCity> queryNationalCity(Map<String, Object> paramMap);
}
