package com.intershop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bhati502 on 9-5-2017.
 */
@RestController
public class RequestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "HELLO......";
    }
}
