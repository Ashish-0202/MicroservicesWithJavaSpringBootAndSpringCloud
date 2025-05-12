package com.microservices.StudentService.DTO;

public class AddressResponse {
    private long addressId;

    private String street;

    private String city;

    private String zipcode;

    public AddressResponse(long addressId, String street, String city, String zipcode) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public AddressResponse() {
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
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
