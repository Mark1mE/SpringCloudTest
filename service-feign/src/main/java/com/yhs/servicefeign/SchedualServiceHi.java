package com.yhs.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuliyhs@163.com
 * @date 2018/4/25 10:55
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)//通过@ FeignClient（“服务名”），来指定调用哪个服务
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
