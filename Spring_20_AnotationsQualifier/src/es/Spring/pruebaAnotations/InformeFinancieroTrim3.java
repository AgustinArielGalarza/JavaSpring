package es.Spring.pruebaAnotations;

/**
 *
 * @author agustin
 */
import org.springframework.stereotype.Component;


@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Precentacion de informe favorable del trimestre 3";

    }
    
}
