package com.intershop.controller;

import com.intershop.model.Status;
import com.intershop.service.CordysServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bhati502 on 9-5-2017.
 */
@RestController
public class RequestController {
    @Autowired
    CordysServices cordysService;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "HELLO......";
    }

    @RequestMapping(value = "/cordys", method = RequestMethod.GET)
    public List<Status> testAllCordys() {
        return cordysService.testAllServerUrls();
    }

}
