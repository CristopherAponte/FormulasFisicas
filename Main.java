/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mycompany.planoinclinado.PlanoInclinado;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        //Scanear por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el ángulo:");
        double angulo= sc.nextDouble();
        System.out.println("Ingresa la masa:");
        double masa= sc.nextDouble();
        System.out.println("Ingresa el radio:");
        double radio=sc.nextDouble();
        System.out.println("Ingresa la energia cinetica de traslación:");
        double energiatraslacion=sc.nextDouble();
        System.out.println("Ingresa la energia de rotación: ");
        double energiarotacion=sc.nextDouble();
        
        
        //LLamando a los métodos.
        PlanoInclinado p = new PlanoInclinado(30,1.5,0.2);
        double inercia=p.momentoInercia();
        double aceleracion=p.aceleracion();
        System.out.println("Ingresa el tiempo:");
        double tiempo=sc.nextDouble();
        double distancia=p.distancia(tiempo);
        double velocidad=p.velocidad(20);
       
        
        
        
        
        //Imprimimos los resultados  
        System.out.println("El momento de Inercia es: " + inercia); 
        System.out.println("La aceleracion es: " + aceleracion); 
        System.out.println("La distancia recorrida a los " +tiempo+ " segundos es: " +distancia); 
        System.out.println("La energia de traslacion es: " +energiatraslacion);
        System.out.println("La energia de rotacion es: " +energiarotacion);
       }
}
