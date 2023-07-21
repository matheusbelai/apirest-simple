package com.belai.apirest.controller;

import com.belai.apirest.entities.Car;
import com.belai.apirest.repository.CarRepository;
import com.belai.apirest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

  @Autowired
  CarRepository carRepository;
  @Autowired
  CarService carService;

  @GetMapping("/car")
  public List<Car> findAll(){
      return carRepository.findAll();
  }

  @GetMapping("/car/{id}")
  public Car findById(@PathVariable Long id){
      return carService.findById(id);
  }

  @PostMapping("/car")
    public Car save(@RequestBody Car car){
      return carRepository.save(car);
  }

  @PutMapping("/car/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car){
     car = carService.updateCar(id, car);
     return carRepository.save(car);
  }

  @DeleteMapping("/car/{id}")
    public void delete(@PathVariable Long id){
       carRepository.deleteById(id);
  }

}
