package es.Spring.pruebaAnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author agustin
 */
public class UsoAnotations {

    public static void main(String[] args) {
        //Configuraremos para que no lea la configuracion de un xml sino de una java.class
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
        
        //Pedir un bean al contenedor
        /*
        Empleados Cleiton = contexto.getBean("dameDirectorFinanciero", Empleados.class);
        
        System.out.println("Ejercicio de practica Nº 23 y 24 \n\n");
        
        System.out.println(Cleiton.getTareas());
        
        System.out.println(Cleiton.getInformes());*/
        
        DirectorFinanciero empleado=contexto.getBean("dame  DirectorFinanciero",DirectorFinanciero.class);
        System.out.println("Email del director: "+empleado.getEmail());
        
        System.out.println("Nombre de la empresa: "+empleado.getNombreEmpresa());
        //Cerrar el contexto
        contexto.close();
    }
    
}
