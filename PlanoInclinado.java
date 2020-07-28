
package com.mycompany.planoinclinado;

public class PlanoInclinado {
    
    private double anguloRad;
    private double masa;
    private double radio;
    private final double gravedad=9.8;
    
    
    public PlanoInclinado(double anguloGrados,double n, double r){
        
        anguloRad= anguloGrados;
        masa=n;
        radio=r;
        
    }
    
    
    public double momentoInercia(){
       return 2.0*masa*Math.pow(radio,2)/5.0;
        
    }
    
    public double aceleracion(){
        double resultado;
        resultado =  gravedad*Math.sin(anguloRad)
                /(1+momentoInercia()/(masa*Math.pow(radio,2)));
        
        return resultado;
    }
    
    public double distancia(double tiempo){
        return aceleracion()*Math.pow(tiempo,2)/2.0;
        
    }
    
    public double velocidad(double tiempo){
        return aceleracion()*tiempo;
    }
    
    public double energiatraslacion(){
        double energtras;
        double velocidadd = 0;
        energtras= 1*masa*velocidadd*velocidadd/2;
        return energtras;
    }
    
    public double energiarotacion(){
        double energrotacion;
        double velocidadangular;
        energrotacion= 1*momentoInercia()*Math.pow(radio, 2);
        return energrotacion;
        
    }
}
