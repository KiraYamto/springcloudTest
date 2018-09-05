package org.bobo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.bobo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 9:52
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String testOne(String name) {
        String url = "http://Boot-Server/springcloud/testone";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        return restTemplate.postForObject(url,jsonObject,String.class);
    }
    public String testTwo(String name) {
        String url = "http://Boot-Server/springcloud/testtwo";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        Response object = restTemplate.postForObject(url,jsonObject,Response.class);
        System.out.println(JSON.toJSONString(object));
        return JSON.toJSONString(object);
    }
    @HystrixCommand(fallbackMethod = "threeError",commandProperties = {})
    public String testThree(String name) {
        String url = "http://Boot-Server/springcloud/testthree";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        Response object = restTemplate.postForObject(url,jsonObject,Response.class);
        System.out.println(JSON.toJSONString(object));
        return JSON.toJSONString(object);
    }
    public String threeError(String name){
        Response response = new Response();
        response.setDesc("failed");
        response.setCode("9999");
        System.out.println("HystrixCommand error!"+name);
        return JSON.toJSONString(response);
    }
}
