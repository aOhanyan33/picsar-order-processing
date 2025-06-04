package org.example.models;

public class Customer implements Comparable<Customer>{
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

    @Override
    public int compareTo(Customer other) {
        // Define natural ordering (e.g., by surname then name)
        int result = this.surname.compareTo(other.surname);
        if (result == 0) {
            result = this.name.compareTo(other.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return surname + ", " + name;
    }

}

