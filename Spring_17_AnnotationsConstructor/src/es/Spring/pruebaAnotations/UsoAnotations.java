package es.Spring.pruebaAnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author agustin
 */
public class UsoAnotations {

    public static void main(String[] args) {
        /**sigue* : Sin olvidar que contexto buscara en la direccion que le pasa por parametro el xml
         que en este caso tendra un bean llamado ''
         este bean se encargara en un segundo plano corroborar si entre todas las clases exite una dependencia de clase
         una inyeccion osea el autowired.*/
        
        //Leer el xml de configuración
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("configuracion/applicationContext.xml");
        
        /*Llamada al autowired: lo que la linea siguiente hace, sin olvidar que buscara un bean es:
        con el primer parametro indicar el nombre del constructor que tiene ese Autowired y con el segundo
        la dependencia de clase que el llamado antonio tiene (no lo tengo tan claro)
        En fin la explicacion sigue arriba *sigue* */
        
        /*Asombrosamente ahora el este proyecto es igual al 15 pero con la particularidad que
            -La explicacion sigue en la clase ComercialExperimentado- */
        
        //Pedir un bean al contenedor
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
        
        //Usar el bean
        
        System.out.println("Revisar el codigo para ver a profundidad la funsion / utilidad de este ejemplo \n\n");
        
        System.out.println(antonio.getTareas());
        
        System.out.println(antonio.getInformes());
        
        //Cerrar el contexto
        
    }
    
}
