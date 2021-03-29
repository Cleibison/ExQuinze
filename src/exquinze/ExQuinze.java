/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exquinze;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExQuinze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 15. Faça um programa que receba o peso de uma pessoa, um valor inteiro, calcule e imprima:
        a. o peso dessa pessoa em gramas;
        b. se essa pessoa engordar 5%, qual será seu novo peso em gramas.*/
        
        Scanner entrada = new Scanner(System.in);
        int peso;
        int grama;
        double aumento = 0.05 ;
        System.out.println("Insira um valor inteiro");
         peso = entrada.nextInt();
        grama = peso*1000;
        aumento = grama+0.05;
        
        
        System.out.println(" O total de  gramas é = "+grama);
        System.out.println(" Seu novo peso em gramas após engordar 5% é = "+aumento);
        
        
    }
    
}
