package es.Spring.pruebaAnotations;

/**
 *
 * @author agustin
 */
public class InformeDinancieroDptoCompras implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del departamento de compras año 2018";
    }
    
}
