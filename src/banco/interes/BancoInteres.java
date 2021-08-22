/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.interes;

import java.util.Scanner;

/**
 *
 * @io 
 */
public class BancoInteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar
        double md, interes=0, inte=0, total;
        int claro;
        int cm;
        String dolar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto depositado :");
        md=teclado.nextDouble();
        System.out.println("Ingrese la cantidad de meses :");
        cm=teclado.nextInt();
        System.out.println("¿Deposita en dolares? (Si/No)");
        dolar=teclado.next();
        //calculos
        if(cm>=1 && cm<=12)
        {
            interes=md*0.03;
        }
        if(cm>=13 && cm<=24)
        {
            interes=md*0.05;
        }
        if(cm>=25)
        {
            interes=md*0.07;
        }
        if (dolar.compareToIgnoreCase ( "si")==0)
        {
            inte=md*0.02;
        }
        total= inte+interes;
        //mostrar importe total
        System.out.println("El monto depositado es :" + md); 
        System.out.println("La cantidad de meses es :" + cm); 
        System.out.println("El interes generado es :" + total);       
    }
    
}
