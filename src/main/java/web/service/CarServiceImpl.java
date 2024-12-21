package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", 12 ,"White"));
        cars.add(new Car("Honda", 7 ,"Yellow"));
        cars.add(new Car("Mazda", 10 ,"Green"));
        cars.add(new Car("Suzuki", 8 ,"Red"));
        cars.add(new Car("Cherry", 22 ,"Black"));

    }
    @Override
    public List<Car> getIdCar(int id) {

        if(id >= cars.size()){
            return cars;
        }
        return cars.subList(0, id);
    }
}
