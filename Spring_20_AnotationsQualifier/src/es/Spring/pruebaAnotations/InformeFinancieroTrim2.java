package es.Spring.pruebaAnotations;

/**
 *
 * @author agustin
 */
import org.springframework.stereotype.Component;


@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Precentacion de informe catastrofico del trimestre 2";
    }
     
}
