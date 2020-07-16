package com.casc.platform.Dao;

import com.casc.platform.bean.NationalCity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NationalCityDao {
    int countNationalCity();

    List<NationalCity> queryNationalCity(Map<String,Object> paramMap);
}
