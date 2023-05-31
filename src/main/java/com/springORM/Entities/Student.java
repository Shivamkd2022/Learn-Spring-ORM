package com.springORM.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jpa_student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roll_no;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String remarks;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;
    // but now it is one directional. It means if we have a student object then we can fetch the details of laptop
    //but its vice versa is not possible.

    //To overcome this situation we will create a object of student in Laptop with @ One to One mapping.
    // this is multi directional.



    //  for many addresses.
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> address_list;


    public Student() {
    }

    public Student(int roll_no, String name, int age, String address, String remarks, Laptop laptop) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.remarks = remarks;
        this.laptop = laptop;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<Address> getAddress_list() {
        return address_list;
    }

    public void setAddress_list(List<Address> address_list) {
        this.address_list = address_list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", remarks='" + remarks + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
