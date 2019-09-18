package es.Spring.IoC;

public class SecretarioEmpleado implements Empleados {
    
    private CreacionInforme informeNuevo;
    private String email;
    private String nombreEmpresa;

    
    public void setInformeNuevo(CreacionInforme informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "gestionar las agendas de los jefes";
    }

    @Override
    public String getInformes() {
        return "Informe generado por el Secretario: "+informeNuevo.getInforme();
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
