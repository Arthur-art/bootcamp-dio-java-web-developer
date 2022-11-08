package springboot.designpatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.designpatterns.model.Cars;
import springboot.designpatterns.repository.CarsRepository;
import springboot.designpatterns.service.CarsService;

@RestController
public class CarsController {

    @Autowired
    CarsRepository carsRepository;

    CarsService carsService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/create-cars")
    public Cars createCars(@RequestBody Cars cars){
      return  carsService.createCar(cars);
    }
}
