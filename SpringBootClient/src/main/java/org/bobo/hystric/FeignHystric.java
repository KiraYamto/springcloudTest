package org.bobo.hystric;

import org.bobo.model.Response;
import org.bobo.service.FeignService;
import org.springframework.stereotype.Service;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 17:25
 */
@Service
public class FeignHystric implements FeignService {
    @Override
    public String testOne(String requestBody) {
        System.out.println("FeignHystric testOne error:"+requestBody);
        return "testone error!";
    }

    @Override
    public Response testTwo(String requestBody) {
        System.out.println("FeignHystric testTwo error:"+requestBody);
        Response response = new Response();
        response.setCode("9999");
        response.setDesc("failed");
        return response;
    }

    @Override
    public Response testThree(String requestBody) {
        System.out.println("FeignHystric testTwo error:"+requestBody);
        Response response = new Response();
        response.setCode("9999");
        response.setDesc("failed");
        return response;    }
}
