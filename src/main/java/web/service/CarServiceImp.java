package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(2007, "Ford Focus 2", "black"));
        cars.add(new Car(2014, "Volkswagen Polo", "white"));
        cars.add(new Car(2016, "Kia Rio", "silver"));
        cars.add(new Car(2008, "Daewoo Matiz 1", "black"));
        cars.add(new Car(2008, "Chevrolete Lanos", "black"));
    }

    public List<Car> getCars(int count){
        return cars.stream().limit(Math.max(count, 0)).collect(Collectors.toList());
    }


}
