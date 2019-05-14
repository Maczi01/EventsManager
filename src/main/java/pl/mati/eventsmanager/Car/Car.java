package pl.mati.eventsmanager.Car;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double capacity;
    @Enumerated(EnumType.STRING)
    private CarType carType;
    private String imgUrlPhoto;
    private int millage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getImgUrlPhoto() {
        return imgUrlPhoto;
    }

    public void setImgUrlPhoto(String imgUrlPhoto) {
        this.imgUrlPhoto = imgUrlPhoto;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }
}
