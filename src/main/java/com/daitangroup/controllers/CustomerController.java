package com.daitangroup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public @ResponseBody String getCustomer(){

        return "customer";
    }
}
