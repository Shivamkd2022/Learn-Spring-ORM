package com.springORM.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_address")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int house_no;
    private String city;
    private int pincode;
    @ManyToOne
    private Student student;
    public Address() {
    }

    public Address(int house_no, String city, int pincode) {
        this.house_no = house_no;
        this.city = city;
        this.pincode = pincode;
    }

    public int getHouse_no() {
        return house_no;
    }

    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house_no=" + house_no +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
