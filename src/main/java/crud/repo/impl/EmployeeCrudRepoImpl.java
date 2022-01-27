package crud.repo.impl;

import crud.entity.EmployeeEntity;
import crud.entity.OficeEntity;
import crud.entity.PositionEntity;
import crud.repo.IEmployeeCrudRepo;
import crud.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudRepoImpl implements IEmployeeCrudRepo {
    public List<EmployeeEntity> findAll() {

        List<EmployeeEntity> employeeList = new ArrayList<>();

        try (Connection dbConn = DBUtils.getDBConn();
             Statement allEmployee = dbConn.createStatement();
             ResultSet resultSet = allEmployee.executeQuery("Select * from empolyee")) {
            while (resultSet.next()) {
                employeeList.add(new EmployeeEntity(
                                resultSet.getInt("id"),
                                getPositionById(resultSet.getInt("id_pos")),
                                getOficeById(resultSet.getInt("id_of")),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getString("date_of_b")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public PositionEntity getPositionById(int id) {
        PreparedStatement takePos = null;
        ResultSet resultSet = null;
        PositionEntity positionEntity = null;

        try (Connection dbConn = DBUtils.getDBConn()) {
            takePos = dbConn.prepareStatement("Select * from position where id = ?");
            takePos.setInt(1, id);
            resultSet = takePos.executeQuery();
            resultSet.next();
            positionEntity = new PositionEntity(resultSet.getInt("id"), resultSet.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeRes(takePos, resultSet);
        }
        return positionEntity;
    }

    public OficeEntity getOficeById(int id) {
        PreparedStatement takeOf = null;
        ResultSet resultSet = null;
        OficeEntity oficeEntity = null;

        try (Connection dbConn = DBUtils.getDBConn()) {
            takeOf = dbConn.prepareStatement("Select * from ofice where id = ?");
            takeOf.setInt(1, id);
            resultSet = takeOf.executeQuery();
            resultSet.next();
            oficeEntity = new OficeEntity(resultSet.getInt("id"), resultSet.getString("adres"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeRes(takeOf, resultSet);
        }
        return oficeEntity;
    }

    private void closeRes(Statement statement, ResultSet resultSet) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
