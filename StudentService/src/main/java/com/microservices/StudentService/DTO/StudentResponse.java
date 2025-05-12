package com.microservices.StudentService.DTO;

public class StudentResponse {

    private long studentId;

    private String firstname;

    private String lastname;

    private long phone;

    private String email;

    private AddressResponse addressResponse;

    public StudentResponse() {
    }

    public StudentResponse(long studentId, String firstname, String lastname, long phone, String email, AddressResponse addressResponse) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.addressResponse = addressResponse;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }
}
