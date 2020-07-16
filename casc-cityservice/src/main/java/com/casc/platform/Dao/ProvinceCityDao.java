package com.casc.platform.Dao;

import com.casc.platform.bean.ProvinceCity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProvinceCityDao {
    List<ProvinceCity> queryProvinceCity(Map<String, Object> paramMap);

    int countTotalSize();
}
