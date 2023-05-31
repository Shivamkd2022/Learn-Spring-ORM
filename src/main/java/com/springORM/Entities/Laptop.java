package com.springORM.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptop")
public class Laptop
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lap_id;
    @Column
    private String model_no;
    @Column
    private String brand;
    @OneToOne
    Student student;

    public Laptop() {
    }

    public Laptop(int lap_id, String model_no, String brand, Student student) {
        this.lap_id = lap_id;
        this.model_no = model_no;
        this.brand = brand;
        this.student = student;
    }

    public int getLap_id() {
        return lap_id;
    }

    public void setLap_id(int lap_id) {
        this.lap_id = lap_id;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lap_id=" + lap_id +
                ", model_no='" + model_no + '\'' +
                ", brand='" + brand + '\'' +
                ", student=" + student +
                '}';
    }
}
