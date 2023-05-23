/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometria;


public class Triangulo {
    private double base; 
    private double altura; 


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }

    public double calcularPerimetro() {
        return (base + altura +  calcularHipotenusa());
    }
    
    public double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public String determinarTipoTriangulo() {
    
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            return "equilátero";
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        return "escaleno";
    else 
        return "isósceles";
    }
}

