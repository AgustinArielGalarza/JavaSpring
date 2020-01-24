package es.Spring.pruebaAnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author agustin
 */
@Component
public class DirectorFinanciero implements Empleados{
    
    private CreacionInformeFinanciero informeFinanciero;
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;
    
   
    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    
    @Override
    public String getTareas() {
        return"Gestion y direccion de las operaciones de la empresa";
    }

    @Override
    public String getInformes() {
        return informeFinanciero.getInformeFinanciero();
    }
    
}
