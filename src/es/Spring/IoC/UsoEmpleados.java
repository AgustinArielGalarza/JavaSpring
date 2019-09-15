package es.Spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

        
public class UsoEmpleados {

    public static void main(String[] args) {

        //Creacion de tipo Empleado 
        
        //Empleados Empleado1 = new DirectorEmpleado();
        
        //Uso de los objetos empleados
        
        //System.out.println(Empleado1.getTareas());
        
        ApplicationContext contexto = new  ClassPathXmlApplicationContext ("fuera/applicationContext.xml"); 
        
        Empleados Agus = contexto.getBean("miEmpleado", Empleados.class);
        
        System.out.println(Agus.getTareas());
        
        

    }
    
}
