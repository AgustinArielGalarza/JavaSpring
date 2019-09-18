package es.Spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author agustin
 */
public class UsoDemoSingletonPrototype {

    public static void main(String[] args) {
        
        //Carga de xml de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("bean/applicationContext2.xml");
        
        //petición de beans al contenedor Spring
        
        SecretarioEmpleado Agus = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        
        SecretarioEmpleado Agustina = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        
        SecretarioEmpleado Roberta = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        
        SecretarioEmpleado Juan = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        
        System.out.println("Aqui vemos como todos los objetos secretarioEmpleado tienen direcciones distintas \n"
                + "\n Usando scope dentro de la etiqueta bean de applicationContext2.xml"
                + "\n scope='singleton' == misma dirección de memoria"
                + "\n scope='prototype == distinta dirección de memorio, como es el caso' \n");
        
        System.out.println(Agus);
        
        System.out.println(Agustina);
        
        System.out.println(Roberta);
        
        System.out.println(Juan);
        
        /*if(Agus == Agustina) System.out.println("Apuntan al mismo espacio en memoria");
        else System.out.println("Apuntan a distinto espacio en memoria");*/
    }
    
}
