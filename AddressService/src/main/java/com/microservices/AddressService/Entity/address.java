package com.microservices.AddressService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressid;

    private String street;

    private String city;

    private String zipcode;

    public address() {
    }

    public address(long addressid, String street, String city, String zipcode) {
        this.addressid = addressid;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public long getAddressid() {
        return addressid;
    }

    public void setAddressid(long addressid) {
        this.addressid = addressid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
