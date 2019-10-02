package es.Spring.IoC;

public class jefeEmpleado implements Empleados{

    private CreacionInforme informeNuevo;
    
    public jefeEmpleado(CreacionInforme ci) {
        this.informeNuevo=ci;
    }
    
    @Override
    public String getTareas (){
        return "Gestiono las cuestiones relativas a mis empleados de seción";
    }

    @Override
    public String getInformes() {
            return "informe precentado por el Jefe con arreglo: " +informeNuevo.getInforme();
    }
    
}
