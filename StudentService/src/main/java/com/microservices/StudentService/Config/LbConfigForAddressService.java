//package com.microservices.StudentService.Config;
//
//import feign.Feign;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//
//@LoadBalancerClient(name = "addressservice")
//public class LbConfigForAddressService {
//
//    @LoadBalanced
//    @Bean
//    public Feign.Builder builder(){
//        return Feign.builder();
//    }
//}
