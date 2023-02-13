package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CarRepositoryInMemory implements CarRepository {
    private final Map<Integer, Car> cars;
    private int length;

    public CarRepositoryInMemory() {
        cars = new HashMap<>();

        save(new Car("Nissan", "orange", 327463875));
        save(new Car("BMW", "black", 276854736));
        save(new Car("Tesla", "silver", 835767843));
        save(new Car("Skoda", "white", 87436547));
        save(new Car("Skoda", "grey", 362547654));
    }

    @Override
    public List<Car> getAll(Integer count) {
        if (count != null && count >= 0 && count < cars.size()) {
            return cars.values().stream()
                    .limit(count).collect(Collectors.toList());
        }

        return new ArrayList<>(cars.values());
    }

    @Override
    public void save(Car car) {
        car.setId(++length);
        cars.put(length, car);
    }
}
