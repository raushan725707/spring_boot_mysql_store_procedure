package com.procedure.service;

import com.procedure.modal.Employee;
import com.procedure.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> saveListEmployee(List<Employee> employee) {
     employee.stream().forEach(employee1 -> employee1.setJoining_date(LocalDate.now()));
    return employeeRepository.saveAll(employee);
    }
    public List<Employee> searchListEmployee(String name){
        return employeeRepository.callEmployeeNameProcedure(name);
    }
    public List<Employee> getemployeebydate(){
        return employeeRepository.getemployeebydate();
    }
}
