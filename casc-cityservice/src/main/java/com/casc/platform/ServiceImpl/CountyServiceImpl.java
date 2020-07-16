package com.casc.platform.ServiceImpl;

import com.casc.platform.Dao.CountyDao;
import com.casc.platform.Service.CountyService;
import com.casc.platform.bean.County;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CountyServiceImpl implements CountyService {

    @Autowired
    private CountyDao countyDao;

    @Override
    public Page<County> queryCounty(Map<String, Object> paramMap) {
        Integer pageno = (Integer) paramMap.get("pageno");
        Integer pagesize = (Integer) paramMap.get("pagesize");
        Page<County> page = new Page<>(pageno,pagesize);
        int startindex = page.getStartindex();
        paramMap.put("startindex",startindex);
        int totalSize = countyDao.countSize();
        List<County> counties = countyDao.queryCounty(paramMap);
        System.out.println("serviceimpl层"+counties.size());
        for (int i = 0; i < counties.size(); i++) {
            System.out.println("serviceimpl层"+counties.get(i).getArea()+counties.get(i).getAQI()+counties.get(i).getNO2());
        }
        page.setTotalsize(totalSize);
        page.setDatas(counties);
        return page;
    }
}
