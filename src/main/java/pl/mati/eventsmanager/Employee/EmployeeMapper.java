package pl.mati.eventsmanager.Employee;

public class EmployeeMapper {

    static EmployeeDto toDto(Employee user) {
        EmployeeDto userDto = new EmployeeDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setImgUrlPhoto(user.getImgUrlPhoto());
        userDto.setActive(user.isActive());
        return userDto;
    }

    static Employee toEntity(EmployeeDto userDto){
        Employee userToEntity = new Employee();
        userToEntity.setId(userDto.getId());
        userToEntity.setFirstName(userDto.getFirstName());
        userToEntity.setLastName(userDto.getLastName());
        userToEntity.setImgUrlPhoto(userDto.getImgUrlPhoto());
        userToEntity.setActive(userDto.isActive());
        return userToEntity;
    }

}
