package es.Spring.pruebaAnotations;

import org.springframework.stereotype.Component;


@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero del trimestre 1";
    }
    
    
}
