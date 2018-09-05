package org.bobo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 12 17:36
 */
@RestController
public class ConfigController {
    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/getProperties",method = {RequestMethod.GET})
    public String getProperties(){
        System.out.println(foo);
        return foo;
    }
}
