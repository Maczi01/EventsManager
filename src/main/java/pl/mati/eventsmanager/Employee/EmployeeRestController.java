package pl.mati.eventsmanager.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @DeleteMapping("/employee/{id}")
    public void removeOffer(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }






}




