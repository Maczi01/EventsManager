package pl.mati.eventsmanager.Car;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarResource {

    private CarService carService;

    public CarResource(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/samochody")
    public String homepage(Model model) {
        List<CarDto> carDtoList = carService.findAllCars();
        model.addAttribute("carDtoList", carDtoList);
        return "cars";
    }

    @GetMapping("/dostawcze")
    public String getOffersByTitle1(Model model) {
        List<CarDto> carDtoList = carService.findCarsTypeVan();
        model.addAttribute("carDtoList", carDtoList);
        return "carsVan";
    }

    @GetMapping("/osobowe")
    public String getOffersByTitle2(Model model) {
        List<CarDto> carDtoList = carService.findCarsTypeCar();
        model.addAttribute("carDtoList", carDtoList);
        return "carssimple";
    }

    @GetMapping("/ciezarowe")
    public String getOffersByTitle3(Model model) {
        List<CarDto> carDtoList = carService.findCarsTypeTruck();
        model.addAttribute("carDtoList", carDtoList);
        return "carssimple";
    }



}