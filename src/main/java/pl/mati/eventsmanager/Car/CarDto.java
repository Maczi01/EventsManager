package pl.mati.eventsmanager.Car;

public class CarDto {

    private Long id;
    private String name;
    private double capacity;
    private String carType;
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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
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
