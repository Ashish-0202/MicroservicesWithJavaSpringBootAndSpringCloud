package com.microservices.AddressService.Controller;

import com.microservices.AddressService.Entity.address;
import com.microservices.AddressService.Service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/address/api")
public class AddressController {

    static Logger logger= LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;

    @GetMapping("/getById/{id}")
    public Optional<address> getById(@PathVariable("id") long id){
        logger.info("Inside AddressService instance 2==="+id);
        return addressService.getById(id);
    }
}
