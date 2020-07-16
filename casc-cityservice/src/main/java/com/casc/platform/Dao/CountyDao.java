package com.casc.platform.Dao;

import com.casc.platform.bean.County;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CountyDao {
    int countSize();

    List<County> queryCounty(Map<String, Object> paramMap);
}
