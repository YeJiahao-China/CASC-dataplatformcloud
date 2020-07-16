package com.casc.platform.ServiceImpl;

import com.casc.platform.Dao.NationalCityDao;
import com.casc.platform.Service.NationalCityService;
import com.casc.platform.bean.NationalCity;
import com.casc.platform.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NationalCityServiceImpl  implements NationalCityService {

    @Autowired
    private NationalCityDao nationalCityDao;

    @Override
    public Page<NationalCity> queryNationalCity(Map<String, Object> paramMap) {
        Integer pageno = (Integer) paramMap.get("pageno");
        Integer pagesize = (Integer) paramMap.get("pagesize");
        Page<NationalCity> page = new Page<>(pageno,pagesize);
        int startindex = page.getStartindex();
        paramMap.put("startindex",startindex);
        int totalsize = nationalCityDao.countNationalCity();
        List<NationalCity> datas = nationalCityDao.queryNationalCity(paramMap);
        page.setDatas(datas);
        page.setTotalsize(totalsize);
        return page;
    }
}
