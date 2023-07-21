package com.belai.apirest.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_car")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( nullable = false )
    private String brand;
    @Column( nullable = false )
    private String name;
    @Column( nullable = false )
    private Integer year;

    public Car() {
    }

    public Car(Long id, String brand, String name, Integer year) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
