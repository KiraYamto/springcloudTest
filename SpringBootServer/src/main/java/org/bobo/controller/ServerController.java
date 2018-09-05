package org.bobo.controller;

import com.alibaba.fastjson.JSON;
import org.bobo.model.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 10 14:25
 */

@RestController
@RequestMapping("/springcloud")
public class ServerController {

    @RequestMapping(value = "/")
    public void index(){
        System.out.println("default asr controller method!");
    }
    @RequestMapping(value = "/testone",method = {RequestMethod.POST})
    public String testMethodone(@RequestBody String requestBody,HttpServletRequest request, HttpServletResponse response){
        System.out.println("request body:"+requestBody);
        Object token = request.getSession().getAttribute("token");
        System.out.println("token:"+token);
        Cookie cookie = new Cookie("token","1111");
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookieVo:cookies) {
                System.out.println("cookie:"+cookieVo.getValue());
            }
        }
        String headerParamUsername = request.getHeader("username");
        String headerParamContentType = request.getHeader("Content-Type");
        String contentType = request.getContentType();
        request.getSession().setAttribute("token","token111");
        System.out.println("USERNAME :"+headerParamUsername+"        Content-Type:"+headerParamContentType+" other:"+contentType);
        System.out.println("testone");
        response.addCookie(cookie);
        return "testone response!";
    }
    @RequestMapping(value = "/testtwo",method = {RequestMethod.POST})
    public Response testMethodTwo(@RequestBody String requestBody,HttpServletRequest request, HttpServletResponse response){
        Response result = new Response();
        result.setCode("000");
        result.setDesc("success");
        System.out.println(JSON.toJSONString(result));
        return result;
    }
}
