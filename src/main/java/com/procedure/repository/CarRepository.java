package com.procedure.repository;

import com.procedure.modal.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface CarRepository extends JpaRepository<Car,Integer> {
    @Procedure("GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModel(String model);
}
