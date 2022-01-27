package crud.service.impl;

import crud.entity.EmployeeEntity;
import crud.repo.IEmployeeCrudRepo;
import crud.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private IEmployeeCrudRepo employeeRepo;

    public EmployeeServiceImpl(IEmployeeCrudRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<EmployeeEntity> readEmployee() {
        return employeeRepo.findAll();
    }
}
