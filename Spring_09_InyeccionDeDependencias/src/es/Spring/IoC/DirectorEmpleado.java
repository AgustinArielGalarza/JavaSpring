package es.Spring.IoC;

public class DirectorEmpleado implements Empleados {
    //Creacion de campo tipo CreacionInforme (interfaz) 
    
    private CreacionInforme informeNuevo;
    private String email;
    private String nombreEmpresa;

    
    //Creacion de constructor que inyecta la dependecia
    public DirectorEmpleado(CreacionInforme ci) {
        this.informeNuevo=ci;
    }
    
    @Override
    public String getTareas() {
        return "Gestionar la platilla de la empresa";
    }

    @Override
    public String getInformes() {
           return "Informe creado por el director: " + informeNuevo.getInforme();
    } 
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
