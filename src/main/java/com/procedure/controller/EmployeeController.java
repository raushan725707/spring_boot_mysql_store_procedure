package com.procedure.controller;

import com.procedure.modal.Employee;
import com.procedure.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
       Employee newEmployee= employeeService.saveEmployee(employee);
        return ResponseEntity.ok(newEmployee);
    }

    @PostMapping("/create/list")
    public ResponseEntity<?> saveListEmployee(@RequestBody List<Employee> employee){
        List<Employee> newEmployee= employeeService.saveListEmployee(employee);
        return ResponseEntity.ok(newEmployee);
    }

    @PostMapping("/list/employee/search")
    ResponseEntity<?> searchEmployee(@RequestParam String name){
        List<Employee> employeeList=  employeeService.searchListEmployee(name);
     return  ResponseEntity.ok(employeeList);
    }

    @GetMapping("/getemployee")
    ResponseEntity<?> getEmployeeByDate(){
      List<Employee>  employeeList=employeeService.getemployeebydate();
      return ResponseEntity.ok(employeeList);
    }
}
