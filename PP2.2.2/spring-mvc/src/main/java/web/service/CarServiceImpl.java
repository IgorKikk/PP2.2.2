package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", 2015, "red"));
        cars.add(new Car("BMW", 2016, "green"));
        cars.add(new Car("Volkswagen", 2017, "blue"));
        cars.add(new Car("Toyota", 2018, "white"));
        cars.add(new Car("Mazda", 2019, "black"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCountOfCars(Integer number) {
        return number >= 5 ? cars : cars.stream().limit(number).collect(Collectors.toList());
    }
}
