package com.yhs.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author wuliyhs@163.com
 * @date 2018/4/25 13:03
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
