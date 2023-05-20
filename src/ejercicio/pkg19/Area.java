/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg19;

public class Area {
    public static double calcular_area(double ladoX,double altura){
        double area;
        area= ((ladoX*altura)/2);
        area= Math.round(area*100d)/100d;
        return area;
    }
}
