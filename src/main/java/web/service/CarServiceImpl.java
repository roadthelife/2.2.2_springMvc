package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> listCar = List.of(new Car(250, "SuperCarSpeed", "-"),
            new Car(180, "CarShopToday", "+"),
            new Car(180, "CarShopToday", "+"),
            new Car(300, "CarGoToTheMars", "+"),
            new Car(210, "CarTrip", "-"),
            new Car(350, "ZeroSpeedFutureCar", "+"));

    public CarServiceImpl() {}

    @Override
    public List<Car> getListCars(Integer count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
