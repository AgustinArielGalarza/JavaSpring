package es.Spring.IoC;

public class DirectorEmpleado implements Empleados {

    public DirectorEmpleado() {
    }

    @Override
    public String getTareas() {
        return "Gestionar la platilla de la empresa";
    }
    
}
