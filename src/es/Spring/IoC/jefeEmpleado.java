package es.Spring.IoC;

public class jefeEmpleado implements Empleados{
    
    @Override
    public String getTareas (){
        return "Gestiono las cuestiones relativas a mis empleados de seción";
    }
    
}
