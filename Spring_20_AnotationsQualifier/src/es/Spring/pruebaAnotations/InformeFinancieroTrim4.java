package es.Spring.pruebaAnotations;

/**
 *
 * @author agustin
 */
import org.springframework.stereotype.Component;


@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Precentacion de informe de cierre de año";
    }
    
}
