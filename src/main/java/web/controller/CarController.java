package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getListOfCars(ModelMap model, @RequestParam(required = false, defaultValue = "5") Integer count) {
        List<Car> cars = carService.getAll(count);
        model.addAttribute("cars", cars);
        model.addAttribute("selectedCount", cars.size());
        return "cars";
    }
}
