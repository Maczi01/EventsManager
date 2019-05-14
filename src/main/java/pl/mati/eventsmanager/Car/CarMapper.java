package pl.mati.eventsmanager.Car;

public class CarMapper {

    static CarDto toDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setName(car.getName());
        carDto.setCapacity(car.getCapacity());
        carDto.setCarType(car.getCarType().toString());
        carDto.setImgUrlPhoto(car.getImgUrlPhoto());
        carDto.setMillage(car.getMillage());
        return carDto;
    }

    static Car toEntity(CarDto carDto){
        Car carToEntity = new Car();
        carToEntity.setId(carDto.getId());
        carToEntity.setName(carDto.getName());
        carToEntity.setCapacity(carDto.getCapacity());
//        carToEntity.setCarType(carDto.getCarType());
        carToEntity.setImgUrlPhoto(carDto.getImgUrlPhoto());
        carToEntity.setMillage(carDto.getMillage());
        return carToEntity;
    }

}
