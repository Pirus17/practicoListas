/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eListas3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Piru
 */
public class eListas3 {
    public static void main(String [] args){
     Scanner scr = new Scanner(System.in);
     ArrayList <Jugador> jugadores= new ArrayList();
     for (int i=0; i<3;i++){
        Jugador datos= new Jugador();
        System.out.println("Ingrese nombre del jugador: ");
        datos.setNombre(scr.next());
        System.out.println("Ingrese apellido del jugador: ");
        datos.setApellido(scr.next());
        System.out.println("Ingrese edad del jugador: ");
        datos.setEdad(scr.nextInt());
        System.out.println("Ingrese goles del jugador: ");
        datos.setGoles(scr.nextInt());
        jugadores.add(datos);
                }
      for (int i=0; i<3;i++){
          System.out.println(jugadores.get(0).getApellido());
                }
    }
    
}
