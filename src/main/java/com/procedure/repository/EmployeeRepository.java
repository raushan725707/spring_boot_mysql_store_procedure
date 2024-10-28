package com.procedure.repository;

import com.procedure.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "CALL employee_name(:nameFilter)", nativeQuery = true)
    List<Employee> callEmployeeNameProcedure(String nameFilter);



    @Query(value = "CALL getemployeebydate()", nativeQuery = true)
    List<Employee> getemployeebydate();

}
