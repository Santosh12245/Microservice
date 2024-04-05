package org.example;

import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@Builder
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = new Customer() ;
        customer.setEmail("santosh@123");
        customer.setFirstName("santosh");
        customer.setLastName("mahapatro");


    }
}
