/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elistas0;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Piru
 */
public class EListas0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numAleatorio= new Random();
        int Arreglo1[]= new int[10];
        int Arreglo2[]= new int[10];
        for (int i=0; i<10; i++){
            
            Arreglo1[i]= numAleatorio.nextInt(75-25+1) + 25;
            Arreglo2[i]= numAleatorio.nextInt(75-25+1) + 25;
        }
        for (int i=0; i<10; i++){
            System.out.println("la multiplicacion de los arreglos: "+(Arreglo1[i]*Arreglo2[i]));
            
        }
        ArrayList <Integer> lista5 = new ArrayList();
        ArrayList <Integer> lista6 = new ArrayList();
        for (int i=0; i<10; i++){
            lista5.add(Arreglo1[i]);
            lista6.add(Arreglo2[i]);        
        }
        for (int i=0; i<10; i++){
            System.out.println("la multiplicacion de las Listas: "+lista5.get(i)*lista6.get(i));
                    }
    }
    
}
