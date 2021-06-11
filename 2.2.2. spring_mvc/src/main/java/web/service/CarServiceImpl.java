package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static List<Car> auto = new ArrayList<>();

    public CarServiceImpl() {
        if (auto.size() == 0) {

            auto.add(new Car("BMV", "German", 1991));
            auto.add(new Car("Lada", "Russia", 1998));
            auto.add(new Car("Nexia", "Korea", 1985));
            auto.add(new Car("Nissan", "Japan", 19982));
            auto.add(new Car("Ford", "USA", 1975));

        }
    }

    @Override
    public List<Car> getCar(String count) {
        if(count == null || Integer.parseInt(count) > 5 || Integer.parseInt(count) < 0) {
            return  auto;
        } else {
            return auto.subList(0, Integer.parseInt(count));
        }

    }

}
