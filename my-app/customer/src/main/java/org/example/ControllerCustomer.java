package org.example;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/customers")
public class ControllerCustomer {
    @Autowired
    CustomerService customerService ;
    @PostMapping("/")
    public void registerCutomer(@RequestBody CustomerRegistrationRequest customerRequest){
        System.out.println(customerRequest);
        customerService.registerCustomer(customerRequest);
    }

}
