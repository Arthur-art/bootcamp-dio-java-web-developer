package springboot.designpatterns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.designpatterns.model.Cars;
import springboot.designpatterns.repository.CarsRepository;

@Service
public class CarsService {
    @Autowired
    CarsRepository carsRepository;

    public Cars createCar(Cars cars){
        Cars newCars = new Cars();
        newCars.setModelo(cars.getModelo());
        newCars.setPlaca(cars.getPlaca());
        newCars.setAno(cars.getAno());
        newCars.setQuilometragem(cars.getQuilometragem());

        carsRepository.save(newCars);

        return newCars;
    }
}
