package org.example.Controllers;

import org.example.Models.estudiantesModel;
import org.example.persistence.imodel.IEstudianteModel;
import org.example.entities.estudiantes;

public class estudiantesController {

    IEstudianteModel estudiantesModel= new estudiantesModel();

    public estudiantes create (estudiantes request){
        return this.estudiantesModel.create(request);
    }
}
