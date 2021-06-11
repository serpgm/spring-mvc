package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, HttpServletRequest request) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCar(request.getParameter("count")));
        return "cars";
    }
}
