package com.microservices.StudentService.Service;

import com.microservices.StudentService.Config.FeignClientConfig;
import com.microservices.StudentService.DTO.AddressResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
    private FeignClientConfig feignClientConfig;

    @CircuitBreaker(name="addressservice", fallbackMethod = "addressServiceFallBack")
    public AddressResponse getAddByID(long id){
        return feignClientConfig.ADDRESS_RESPONSE(id);
    }

    public AddressResponse addressServiceFallBack(long id,Throwable t){
        System.out.println("Inside fall back method");
        return new AddressResponse(101,"unknown-Fallback","unknown-Fallback","unknown");
    }
}
