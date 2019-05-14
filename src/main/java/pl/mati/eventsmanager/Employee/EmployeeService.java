package pl.mati.eventsmanager.Employee;

import org.springframework.stereotype.Service;

import java.nio.file.LinkOption;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    List<EmployeeDto> findAllEmployees(){
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapper::toDto)
                .collect(Collectors.toList());
    }

    List<EmployeeDto> findNotActiveEmployees() {
        return employeeRepository.findEmployeeByActiveIsTrue()
                .stream()
                .map(EmployeeMapper::toDto)
                .collect(Collectors.toList());
    }

    List<EmployeeDto> findActiveEmployees() {
        return employeeRepository.findEmployeeByActiveIsFalse()
                .stream()
                .map(EmployeeMapper::toDto)
                .collect(Collectors.toList());
    }

//        EmployeeDto getemployeeById(Long id){
//        Optional<Employee> optionalEvent = employeeRepository.findById(id);
//        return optionalEvent.map(EmployeeMapper::toDto).orElse(null);
//    }

    int count() {
        return employeeRepository.findAll().size();
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
