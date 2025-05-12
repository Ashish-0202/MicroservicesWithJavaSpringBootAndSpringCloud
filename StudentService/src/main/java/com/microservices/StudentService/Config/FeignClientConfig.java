package com.microservices.StudentService.Config;

import com.microservices.StudentService.DTO.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "addressservice",path = "/address/api")
public interface FeignClientConfig {

    @GetMapping("/getById/{id}")
    AddressResponse ADDRESS_RESPONSE(@PathVariable("id") long id);
}
