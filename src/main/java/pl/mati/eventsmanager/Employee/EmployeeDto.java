package pl.mati.eventsmanager.Employee;

public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String imgUrlPhoto;
    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImgUrlPhoto() {
        return imgUrlPhoto;
    }

    public void setImgUrlPhoto(String imgUrlPhoto) {
        this.imgUrlPhoto = imgUrlPhoto;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
