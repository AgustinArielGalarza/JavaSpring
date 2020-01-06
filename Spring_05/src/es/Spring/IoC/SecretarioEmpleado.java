package es.Spring.IoC;

public class SecretarioEmpleado implements Empleados {


    @Override
    public String getTareas() {
        return "gestionar las agendas de los jefes";
    }
    
}
