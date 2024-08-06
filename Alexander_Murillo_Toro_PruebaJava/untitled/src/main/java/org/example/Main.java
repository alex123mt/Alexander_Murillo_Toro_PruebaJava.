package org.example;
import org.example.Controllers.*;
import org.example.entities.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        String option= null;
        do{
            option = JOptionPane.showInputDialog(null, "Bienvenido\n"+"Ingrese entidad\n"+ "1. estudiante\n");
            switch (option){
                case "1":
                    String option1= null;
                    do {
                        option1 = JOptionPane.showInputDialog(null, "ingrese que accion desea hacer:\n"+"1.agregar\n"+"2.eliminar\n"+"3.editar\n"+"4.Volver");
                        switch (option1){
                            case "1":
                                estudiantesController estudiantesController= new estudiantesController();
                                String email= JOptionPane.showInputDialog("ingresa tu email");
                                String estado= JOptionPane.showInputDialog("ingresa el estado");
                                String nombre= JOptionPane.showInputDialog("ingresa tu nombre");

                                estudiantes Estudiantes= new estudiantes(email,estado,nombre);
                                estudiantesController.create(Estudiantes);
                                return;
                        }
                    }while (!option1.equals("4"));
                        return;
            }
        }while(!option.equals("salir"));
    }
}