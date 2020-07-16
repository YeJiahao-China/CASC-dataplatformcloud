package com.casc.platform.ServiceImpl;

import com.casc.platform.Dao.ProvinceCityDao;
import com.casc.platform.Service.ProvinceCityService;
import com.casc.platform.bean.ProvinceCity;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProvinceCityServiceImpl implements ProvinceCityService {

    @Autowired
    private ProvinceCityDao provinceCityDao;

    @Override
    public Page<ProvinceCity> queryProvinceCity(Map<String, Object> paramMap) {
        Integer pageno = (Integer) paramMap.get("pageno");
        Integer pagesize = (Integer) paramMap.get("pagesize");
        Page<ProvinceCity> page = new Page(pageno, pagesize);
        int startindex = page.getStartindex();
        paramMap.put("startindex", startindex);
        List<ProvinceCity> datas = provinceCityDao.queryProvinceCity(paramMap);
        int totalsize = provinceCityDao.countTotalSize();
        page.setDatas(datas);
        page.setTotalsize(totalsize);
        return page;
    }
}
