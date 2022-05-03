package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCars;



    @Controller
//    @RequestMapping("/")
    public class CarController {

        private ServiceCars serviceCars;

        @Autowired
        public CarController(ServiceCars serviceCars) {
            this.serviceCars = serviceCars;
        }

        @GetMapping(value ="cars")
        public String allCars(@RequestParam(value = "count", required = false, defaultValue = "0") int i, ModelMap model) {
            model.addAttribute("listCars", serviceCars.countOfCars(i));
            return "cars";
        }
    }


