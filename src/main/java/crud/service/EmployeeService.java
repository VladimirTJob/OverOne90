package crud.service;

import crud.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> readEmployee();
}
