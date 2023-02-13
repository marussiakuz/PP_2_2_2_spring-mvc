package web.repository;

import web.model.Car;

import java.util.List;

public interface CarRepository {

    List<Car> getAll(Integer count);

    void save(Car car);
}
