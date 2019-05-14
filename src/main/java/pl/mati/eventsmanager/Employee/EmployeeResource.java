package pl.mati.eventsmanager.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EmployeeResource {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //    @GetMapping("/user")
//    public List<EmployeeDto> all(@RequestParam(required = false) String lastName) {
//        return userService.findAllUsers();
//    }
    @GetMapping("/pracownicy")
    public String homepage(Model model) {
        List<EmployeeDto> employeeDtoList = employeeService.findAllEmployees();
        model.addAttribute("employeeDtoList", employeeDtoList);
        return "employees";
    }

    @GetMapping("/aktywni")
    public String actives(Model model) {
        List<EmployeeDto> employeeDtoList = employeeService.findNotActiveEmployees();
        model.addAttribute("employeeDtoList", employeeDtoList);
        return "employeesactive";
    }


    @GetMapping("/nieaktwni")
    public String notActives(Model model) {
        List<EmployeeDto> employeeDtoList = employeeService.findActiveEmployees();
        model.addAttribute("employeeDtoList", employeeDtoList);
        return "employeesnotactive";
    }

//    @GetMapping("/")
//    public String homepage(Model model) {
//        List<Animal> animalRepositoryAll = animalRepository.findAll();
//        model.addAttribute("animalsList", animalRepositoryAll);
//        List<String> categoriesRepositoryAll = categoryRepository.findAll();
//        model.addAttribute("categoryRepository", categoriesRepositoryAll);
//        return "stronaGlowna";
//    }


//    @GetMapping("/user/{id}")
//    public ResponseEntity<EmployeeDto> getOfferBy(@PathVariable Long id) {
//        EmployeeDto userById = userService.getUserById(id);
//        return ResponseEntity.ok(userById);
//    }
//
//    @GetMapping("/user/count")
//    public int count(){
//        return userService.count();
//    }
}
