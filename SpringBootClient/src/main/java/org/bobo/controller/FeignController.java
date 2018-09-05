package org.bobo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.bobo.model.Response;
import org.bobo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 15:24
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService service;
    @RequestMapping(value = "/feign/testone",method = {RequestMethod.POST})
    public String testOne(@RequestBody String requestBody, HttpServletRequest request, HttpServletResponse response){
        System.out.println(requestBody);
        String username = request.getHeader("username");
        System.out.println(username);
        String result = service.testOne(requestBody);
        System.out.println(result);
        return result;
    }
    @RequestMapping(value = "/feign/testtwo",method = {RequestMethod.POST})
    public Response testTwo(@RequestBody String requestBody, HttpServletRequest request){
        System.out.println(requestBody);
        Response result = service.testTwo(requestBody);
        System.out.println(JSON.toJSONString(result));
        return result;
    }
    @RequestMapping(value = "/feign/testthree",method = {RequestMethod.POST})
    public Response testThree(@RequestBody String requestBody, HttpServletRequest request){
        System.out.println(requestBody);
        Response result = service.testThree(requestBody);
        System.out.println(JSON.toJSONString(result));
        return result;
    }
}
