package pl.mati.eventsmanager.Car;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    List<CarDto> findAllCars(){
        return carRepository.findAll()
                .stream()
                .map(CarMapper::toDto)
                .collect(Collectors.toList());
    }

    CarDto findCarById(Long id){
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.map(CarMapper::toDto).orElse(null);
    }

    List<CarDto> findCarsTypeVan(){
        return carRepository.findVans()
                .stream()
                .map(CarMapper::toDto)
                .collect(Collectors.toList());
    }

    List<CarDto> findCarsTypeCar(){
        return carRepository.findCars()
                .stream()
                .map(CarMapper::toDto)
                .collect(Collectors.toList());
    }

    void saveCar(CarDto carDto){
        Car car = CarMapper.toEntity(carDto);
        carRepository.save(car);
    }

    public List<String> findAllTypes() {
        return carRepository.findAllTypes();
    }

    public List<CarDto> findCarsTypeTruck() {
        return carRepository.findTrucks()
                .stream()
                .map(CarMapper::toDto)
                .collect(Collectors.toList());
    }
}
