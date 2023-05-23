/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometria;

/**
 *
 * @author ACER
 */
public class Rectangulo {
    private int base; 
    private int altura; 

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
