package com.belai.apirest.service;

import com.belai.apirest.entities.Car;
import com.belai.apirest.repository.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CarService {


    @Autowired
    CarRepository carRepository;

    public Car findById(Long id){
        return carRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("id not found"));
    }

    public Car updateCar(Long id, Car attCar){
        Car car = carRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("id not found"));

        car.setBrand(attCar.getBrand());
        car.setName(attCar.getName());
        car.setYear(attCar.getYear());

        return car;
    }
}
