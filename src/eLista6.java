
import eListas4.Cuenta;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Piru
 */
public class eLista6 {

    public static void main(String[] arg) {
        ArrayList<Persona> clientes = new ArrayList();
        Persona personas;
        personas = new Persona("Fausto", "8888888", 65);
        clientes.add(personas);
        personas = new Persona("Santi", "8888888", 5);
        clientes.add(personas);
        personas = new Persona("Tucho", "8888888", 14);
        clientes.add(personas);
        personas = new Persona("Maxi", "8888888", 14);
        clientes.add(personas);
        personas = new Persona("Marcos", "8888888", 9);
        clientes.add(personas);
        personas = new Persona("Martin", "8888888", 70);
        clientes.add(personas);
        personas = new Persona("Joaquin", "8888888", 3);
        clientes.add(personas);
        for (int i = 0; i < clientes.size(); i++) {
             System.out.println(clientes.get(i).toString());
        }
        int recaudacion=0;
        for (int i = 0; i < clientes.size(); i++) {
            recaudacion += clientes.get(i).CalcularEntrada();
        }
        System.out.println("La recaudacion del cine es: "+recaudacion);
    }

}
