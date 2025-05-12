package com.microservices.AddressService.Service;

import com.microservices.AddressService.Entity.address;
import com.microservices.AddressService.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Optional<address> getById(long id) {
        return addressRepository.findById(id);
    }
}
