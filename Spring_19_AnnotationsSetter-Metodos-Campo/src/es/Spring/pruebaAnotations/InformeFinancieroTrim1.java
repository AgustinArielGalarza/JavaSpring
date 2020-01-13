package es.Spring.pruebaAnotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author agustin
 */

/*Es por @Component que @Autowired sabe que clase inyectar*/
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero del trimestre 1";
    }
    
    
}
