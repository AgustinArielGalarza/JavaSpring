package es.Spring.pruebaAnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author agustin
 */
public class UsoAnotations {

    public static void main(String[] args) {
        //Leer el xml de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("configuracion/applicationContext.xml");
        
        //Pedir un bean al contenedor
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
        
        //Usar el bean
        
        System.out.println("Revisar el codigo para ver a profundidad la funsion / utilidad de este ejemplo \n\n");
        
        System.out.println(antonio.getTareas());
        
        System.out.println(antonio.getInformes());
        
        //Cerrar el contexto
        
    }
    
}
