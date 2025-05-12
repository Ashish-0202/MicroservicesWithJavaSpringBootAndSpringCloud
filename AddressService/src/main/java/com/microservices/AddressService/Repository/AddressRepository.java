package com.microservices.AddressService.Repository;

import com.microservices.AddressService.Entity.address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<address,Long> {

}
