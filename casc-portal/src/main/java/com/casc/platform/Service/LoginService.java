package com.casc.platform.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@FeignClient("casc-indexService")
public interface LoginService {

    @RequestMapping("doLogin")
    boolean doLogin(@RequestBody HashMap<String, String> paramMap);
}
