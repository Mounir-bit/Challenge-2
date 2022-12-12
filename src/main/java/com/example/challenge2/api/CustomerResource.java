package com.example.challenge2.api;


import com.example.challenge2.service.CustomerService;
import com.example.challenge2.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value  ="/customers")
public class CustomerResource {

    @Autowired
    private CustomerService customerService ;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomer();
    }
    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId){
        return customerService.getCustomer(customerId);
    }

    @PutMapping(value = "/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerService.deleteCustomer(customerId);
    }
}
