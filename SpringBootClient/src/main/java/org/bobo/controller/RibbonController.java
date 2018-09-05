package org.bobo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.bobo.model.Response;
import org.bobo.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 10:04
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService service;

    @RequestMapping(value = "/ribbon/testone",method = {RequestMethod.POST})
    public String testOne(@RequestBody String requestBody, HttpServletRequest request){
        System.out.println(requestBody);
        JSONObject json = JSON.parseObject(requestBody);
        String  name = json.getString("name");
        System.out.println(name);
        return service.testOne(name);
    }
    @RequestMapping(value = "/ribbon/testtwo",method = {RequestMethod.POST})
    public Response testTwo(@RequestBody String requestBody, HttpServletRequest request){
        System.out.println(requestBody);
        JSONObject json = JSON.parseObject(requestBody);
        String  name = json.getString("name");
        System.out.println(name);
        String response = service.testTwo(name);
        System.out.println();
        return JSON.parseObject(response,Response.class);

    }
    @RequestMapping(value = "/ribbon/testthree",method = {RequestMethod.POST})
    public String  testThree(@RequestBody String requestBody, HttpServletRequest request){
        System.out.println(requestBody);
        JSONObject json = JSON.parseObject(requestBody);
        String  name = json.getString("name");
        System.out.println(name);
        return service.testThree(name);
    }
}
