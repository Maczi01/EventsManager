package pl.mati.eventsmanager.Car;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarRestController {

    private CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public List<CarDto> allCars(){
        return carService.findAllCars();
    }

    @GetMapping("/car/{id}")
    public CarDto getCarById(@PathVariable Long id){
        return carService.findCarById(id);
    }

//    @GetMapping("/car/{carType}")
//    public List<CarDto> getCarsByType(CarType carType){
//        return carService.findCarsByType(carType);
//    }

    @PostMapping("/api/offers")
    @ResponseBody
    public void addCar(@RequestBody CarDto carDto) {
        carService.saveCar(carDto);
    }

    @GetMapping("/api/car/type")
    public List<String> getAllCarType() {
        return carService.findAllTypes();
    }


}
