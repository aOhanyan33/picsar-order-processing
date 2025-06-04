package org.example.models;

public class Address implements Comparable<Address>{
    private String street;
    private String city;
    private String country;

    public Address (String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public void  setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    @Override
    public int compareTo(Address other) {
        // Define natural ordering (e.g., by surname then name)
        int result = this.city.compareTo(other.city);
        if (result == 0) {
            result = this.country.compareTo(other.country);
        }
        return result;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }


}
