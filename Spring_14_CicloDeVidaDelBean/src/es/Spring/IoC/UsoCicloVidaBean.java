package es.Spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //cargar el xml configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("bean/applicationContext2.xml");
        
        //La obtención del bean
        Empleados Agus = contexto.getBean("miEmpleado",Empleados.class);
        
        //Pedir informe
        System.out.println(Agus.getInformes());
        
        
    }
    
}
