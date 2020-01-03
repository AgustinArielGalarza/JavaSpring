package es.Spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {


    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("bean/applicationContext.xml");
        
        System.out.println("----Inyección de dependecias con constructor----\t\n");
        
        Empleados Agus = contexto.getBean("miEmpleado", Empleados.class);
        
        System.out.println(Agus.getTareas());
        
        System.out.println(Agus.getInformes());
        
        System.out.println("\t\n----Inyección de dependecias con setters----\t\n");
        
        //Se cambia de clase <Empleado> por <SecretarioEmpleado> para poder acceder a los geters y seters de la clase
        
        SecretarioEmpleado Agustina = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        
        System.out.println(Agustina.getTareas());
        
        System.out.println(Agustina.getInformes());
        
        System.out.println("\t\n----Inyección de dependecias de campos----\t\n");
        
        System.out.println("Nombre de la empresa: "+ Agustina.getNombreEmpresa());
        
        System.out.println("Email: "+ Agustina.getEmail());
        
        contexto.close();
        

    }
    
}
