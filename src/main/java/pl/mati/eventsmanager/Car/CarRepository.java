package pl.mati.eventsmanager.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.lang.annotation.Native;
import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    //        @Query("SELECT c FROM Car c " +
//                " WHERE 1=1 " +
//                " AND (:carType IS NULL OR lower(c.carType) LIKE CONCAT('%', :carType, '%'))"
//        )
    @Query(value = "SELECT * FROM CAR where CAR_TYPE= 'VAN'", nativeQuery = true)
    List<Car> findVans();
    //        List<Car> findByType(@Param("carType") String carType);

    @Query(value = "SELECT * FROM CAR where CAR_TYPE= 'CAR'", nativeQuery = true)
    List<Car> findCars();


    @Query(value = "select car_type from car", nativeQuery = true)
    List<String> findAllTypes();

    @Query(value = "SELECT * FROM CAR where CAR_TYPE= 'TRUCK'", nativeQuery = true)
    List<Car> findTrucks();
}
