package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

@Component
public class ServiceCars {
    private List<Car> listCars;

    public ServiceCars(List<Car> listCars) {
        this.listCars = listCars;

        Car car1 = new Car("Volkswagen", "red", 2012);
        Car car2 = new Car("Skoda", "yellow", 2011);
        Car car3 = new Car("Kia", "blue", 2015);
        Car car4 = new Car("Renault", "black", 1999);
        Car car5 = new Car("Lada", "white", 2020);

        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
    }

    public List<Car> countOfCars(int i){
        if ((i > 0)&&(i < 5)) return listCars.subList(0,i);
        else return listCars;
    }

}
