package org.example.Models;

import org.example.entities.estudiantes;
import org.example.persistence.ConfigDB.MysqlConfig;
import org.example.persistence.imodel.IEstudianteModel;
import java.sql.*;

public class estudiantesModel implements IEstudianteModel {

    @Override
    public estudiantes create(estudiantes request) {
        Connection connection = MysqlConfig.openConnection();
        String sqlQuery = "INSERT INTO estudiantes (email_estudiante,estado,nombre_estudiante) values (?,?,?);";

        estudiantes estuadianteEntity= new estudiantes();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getEmail_Estudiante());
            preparedStatement.setString(2, request.getEstado());
            preparedStatement.setString(3,request.getNombre());

            int resulset= preparedStatement.executeUpdate();

            if (resulset==1) {
                return request;
            }
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return estuadianteEntity;
    }
}
