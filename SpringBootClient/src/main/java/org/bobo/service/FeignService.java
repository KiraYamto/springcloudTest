package org.bobo.service;

import org.bobo.hystric.FeignHystric;
import org.bobo.model.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 15:24
 */
@FeignClient(value = "Boot-Server",fallback = FeignHystric.class)
public interface FeignService {

    @RequestMapping(value = "/springcloud/testone",method = RequestMethod.POST)
    String testOne(@RequestBody String requestBody);
    @RequestMapping(value = "/springcloud/testtwo",method = RequestMethod.POST)
    Response testTwo(@RequestBody String requestBody);
    @RequestMapping(value = "/springcloud/testthree",method = RequestMethod.POST)
    Response testThree(@RequestBody String requestBody);
}
