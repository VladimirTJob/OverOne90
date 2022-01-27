package crud.repo;

import crud.entity.EmployeeEntity;

import java.util.List;

public interface IEmployeeCrudRepo {
    List<EmployeeEntity> findAll();
}
