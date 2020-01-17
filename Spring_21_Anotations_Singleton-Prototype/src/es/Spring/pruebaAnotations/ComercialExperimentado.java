package es.Spring.pruebaAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author agustin
 */
@Component
@Scope("prototype") //simplemente con esta anotacion ya creara objetos con distintas direcciones de memoria
public class ComercialExperimentado implements Empleados{
    
    /*En este ejemplo tenemos 4 clases que implementa la dependencia 'CreacionInformeFinanciero'
    ¿Como hace @Autowired para identificar cual exactamente llamar?
    -Pues con @Qualifier que con su contructor se le espesifica el nombre de la clase a la que se desea apuntar
    con la primera letra en minuscula.*/
    
    @Autowired
    @Qualifier ("informeFinancieroTrim2") //bean id que debe utilizar
    private CreacionInformeFinanciero nuevoInforme;
    
    
    @Override
    public String getTareas() {
        return "Vender, vender y vender mas!";
    }

    @Override
    public String getInformes() {
        //return "Esto es un informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }
    
    
    
}
