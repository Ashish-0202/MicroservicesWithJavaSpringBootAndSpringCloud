package com.microservices.StudentService.Service;

import com.microservices.StudentService.Config.FeignClientConfig;
import com.microservices.StudentService.Config.WebClientConfig;
import com.microservices.StudentService.DTO.AddressResponse;
import com.microservices.StudentService.DTO.StudentResponse;
import com.microservices.StudentService.Entity.student;
import com.microservices.StudentService.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private WebClient webClient;

    @Autowired
    private FeignClientConfig feignClientConfig;

    public StudentResponse findById(long id) {
        Optional<student> s1=studentRepository.findById(id);

        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setStudentId(s1.get().getStudentId());
        studentResponse.setFirstname(s1.get().getFirstname());
        studentResponse.setLastname(s1.get().getLastname());
        studentResponse.setEmail(s1.get().getEmail());

        //AddressResponse addressResponse = addressResponse(s1.get().getAddressId());
        AddressResponse addressResponse = getById(s1.get().getAddressId());
        studentResponse.setAddressResponse(addressResponse);
        return studentResponse;
    }

    public AddressResponse addressResponse(long id){
        Mono<AddressResponse> responseMono=webClient.get().uri("address/api/getById/"+id)
                .retrieve().bodyToMono(AddressResponse.class);

        return responseMono.block();
    }

    public AddressResponse getById(long id){
        AddressResponse addressResponse = feignClientConfig.ADDRESS_RESPONSE(id);
        return addressResponse;
    }
}
