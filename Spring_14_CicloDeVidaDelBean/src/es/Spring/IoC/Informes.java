package es.Spring.IoC;



public class Informes implements CreacionInforme{
    
    @Override
    public String getInforme(){
        return "Esta es la presentacion del informe";
    }

    
}
