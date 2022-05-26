package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCars(Integer count) {
        List<Car> listCar;
        {
            listCar = new ArrayList<>();

            listCar.add(new Car(250, "SuperCarSpeed", "-"));
            listCar.add(new Car(180, "CarShopToday", "+"));
            listCar.add(new Car(300, "CarGoToTheMars", "+"));
            listCar.add(new Car(210, "CarTrip", "-"));
            listCar.add(new Car(350, "ZeroSpeedFutureCar", "+"));
        }

        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
