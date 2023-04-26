/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10;


public class Condicional {
    public static double calculo_matricula(double estrato, double patrimonio){
        double matricula;
        
        if(patrimonio>2000000 && estrato>3){
           matricula = (50000) + (patrimonio*0.03);
            return matricula;
        }
        return 50000;
    }  
}
