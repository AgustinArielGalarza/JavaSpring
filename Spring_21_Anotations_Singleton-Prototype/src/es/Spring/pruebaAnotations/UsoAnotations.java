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
        
        Empleados pedrito = contexto.getBean("comercialExperimentado", Empleados.class);
        
        //¿Apuntan al mismo director de memoria?
        
        if(antonio == pedrito){
            System.out.println("Apuntan a la misma direccion de memoria");
            System.out.println(antonio+"\n"+pedrito);
        }else{
            System.out.println("No apuntan a la misma direccion de memoria");
            System.out.println(antonio+"\n"+pedrito);
        }
        //Cerrar el contexto
        contexto.close();
    }
    
}
