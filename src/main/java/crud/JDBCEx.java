package crud;

import crud.entity.EmployeeEntity;
import crud.repo.impl.EmployeeCrudRepoImpl;
import crud.service.EmployeeService;
import crud.service.impl.EmployeeServiceImpl;

import java.util.List;

public class JDBCEx {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl(new EmployeeCrudRepoImpl());
        List<EmployeeEntity> employeeEntities = employeeService.readEmployee();
        for (EmployeeEntity employeeEntity : employeeEntities
                ) {
            System.out.println(employeeEntity);
        }
    }
}
