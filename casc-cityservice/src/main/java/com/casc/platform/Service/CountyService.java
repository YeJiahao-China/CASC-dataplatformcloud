package com.casc.platform.Service;

import com.casc.platform.bean.County;
import com.casc.platform.util.Page;

import java.util.Map;

public interface CountyService {
    Page<County> queryCounty(Map<String, Object> paramMap);
}
