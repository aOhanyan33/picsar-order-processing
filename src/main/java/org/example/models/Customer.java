package org.example.models;

public class Customer {
    private String name;
    private String surname;
    private String phone;
    private  Address address;

    public Customer (String name, String surname, String phone, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    public  String getSurname(){
        return surname;
    }
    public String getPhone() {
        return phone;
    }
    public Address getAddress() {

        return address;
    }

    public void setName(String name){
        this.name = name;
    }
    public  void setSurname(String surname){
        this.surname = surname;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName(){
        return name + " " + surname;

    }
    public void printSummary(){
        System.out.println("Customer" + name + surname + phone + address);
    }

}

