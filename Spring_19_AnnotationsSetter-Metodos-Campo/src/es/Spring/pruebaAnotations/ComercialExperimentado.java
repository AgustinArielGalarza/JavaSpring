package es.Spring.pruebaAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author agustin
 */
@Component 
public class ComercialExperimentado implements Empleados{

    

    /*Autowired: Una vez instanciado en el mein 'contexto.getBean' de la clase (esta/this) *ver explicacion en la clase mein*
    Esta anotacion buscara a travez de la dependencia/interfase una clase que implemente esta.
    En este caso la clase que implementa la interfase CreacionInformesFinanciero es = InformeFinancieroTrim1
    Y lo que hace a travez del constructor es inyectarle la clase InformeFinancieroTrim1 al atrivuto nuevoInforme
    @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
    this.nuevoInforme = nuevoInforme;
    }
     */
    
    /*IMPORTANTE:
    ¿Y como sabe @Autowired que dependencia inyectar?
    -Pues en la clase que implementa la dependecia/interface 'InformeFinancieroTrim1' el metodo de que es obligado
    por la interface posee un @Component*/
    
    public CreacionInformeFinanciero getNuevoInforme() {
        return nuevoInforme;
    }
    
    /*Dejando toda la configuracion igual, pero poniendo Autowired en el setter Funciona igual
    (Me sorprende que xml con la etiqueta constructor siga funsionando)
    Incluso se le cambia el nombre del metodo y sigue funsionando
    @Autowired
    public void queMasDaElNombre(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    @Override
    public String getTareas() {
        return "Vender, vender y vender mas!";
    }

    @Override
    public String getInformes() {
        //return "Esto es un informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }
    
    /*Bueno ahora si me volvi loco, poniendo autowired en el campo de la clase, es decir en el atributo nuevoInforme
    Aún dejando toda la configuracion igual sigue funsionando*/
    @Autowired
    private CreacionInformeFinanciero nuevoInforme;
    
}
/*Conclucion Autowired inyecto la clase que implemente la dependencia.*/