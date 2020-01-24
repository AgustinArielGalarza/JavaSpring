package es.Spring.pruebaAnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//no funciona porque creo que en linux no es lo mismo
@Configuration
@ComponentScan ("es.Spring.pruebaAnotations")
@PropertySource ("classpath:datos/datosEmpresa.propiedades")

public class EmpleadosConfig {
    
    //Definir el bean para el informeFinancieroDptoCompras
    
    @Bean
    public CreacionInformeFinanciero dameInformeFinancieroDptoCompras(){ //esto sera el id del bean iyectado
        return new InformeDinancieroDptoCompras();
    }
    
    //Definir el bean para DirectorFinanciero e inyectar dependecias    
    
    //este es nombre del id que se utilizara en el mein. contexto.getBean ("dameDirectorFinanciero", Empleados.class);
    @Bean 
    public Empleados dameDirectorFinanciero (){
        return new DirectorFinanciero(dameInformeFinancieroDptoCompras());
    }
}
