/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eListas4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Piruxb17
 */
public class eLista4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        ArrayList<Cuenta> cliente = new ArrayList();
        do {
            Boolean existe;
            int nroCuenta;
            System.out.println("1. ALTA DE CUENTA: ");
            System.out.println("2. DEPOSITAR: ");
            System.out.println("3. EXTRAER: ");
            System.out.println("4. BUSQUEDA POR DNI ");
            System.out.println("5. ACTIVAR CUENTA ");
            System.out.println("6. DESACTIVAR CUENTA ");
            System.out.println("7. MOSTRAR TODOS LOS DATOS");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Cuenta datos;
                    /*System.out.println("ALTA DE CUENTA: ");
                System.out.println("Ingrese numero de cuenta: ");
                datos.setNroCuenta(sc.nextInt());
                System.out.println("Ingrese DNI del titular: ");
                datos.setDniTitular(sc.nextInt());
                System.out.println("Ingrese fecha de apertura: ");
                datos.setFechaApertura(sc.next());
                datos.activarCuenta();
                datos.setSaldo(0);
                cliente.add(datos);*/
                    datos = new Cuenta(1, 30712141, "11-03-23", true, 0);
                    cliente.add(datos);
                    datos = new Cuenta(2, 32476002, "10-04-21", true, 0);
                    cliente.add(datos);
                    datos = new Cuenta(3, 33476002, "10-04-20", true, 0);
                    cliente.add(datos);
                    break;
                case 2:
                    System.out.println("DEPOSITAR EN CUENTA: ");
                    System.out.println("Ingrese numero de cuenta: ");
                    nroCuenta = sc.nextInt();
                    for (int i = 0; i < cliente.size(); i++) {
                        if (cliente.get(i).getNroCuenta() == nroCuenta) {
                            System.out.println("Ingrese el monto: ");
                            if (cliente.get(i).depositar(sc.nextFloat())) {
                                System.out.println("dep Exitoso");
                            } else {
                                System.out.println("No pudo realizar la dep");
                            }

                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("EXTAER DE CUENTA: ");
                    System.out.println("Ingrese numero de cuenta: ");
                    nroCuenta = sc.nextInt();
                    for (int i = 0; i < cliente.size(); i++) {
                        if (cliente.get(i).getNroCuenta() == nroCuenta) {
                            System.out.println("Ingrese el monto: ");
                            if (cliente.get(i).extraer(sc.nextFloat())) {
                                System.out.println("Extraccion Exitosa");
                            } else {
                                System.out.println("No pudo realizar la Extraccion");
                            }
                           
                        }
                    
                    }
                    break;
                case 4:
                    System.out.println("BUSQUEDA POR DNI: ");
                    System.out.println("Ingrese DNI: ");
                    int DNI = sc.nextInt();
                    for (int i = 0; i < cliente.size(); i++) {
                        if (cliente.get(i).getDniTitular() == DNI) {
                            System.out.println("Numero de Cuenta: " + cliente.get(i).getNroCuenta());
                            System.out.println("Fecha: " + cliente.get(i).getFechaApertura());
                            System.out.println("Saldo: " + cliente.get(i).getSaldo());
                            break;
                        } else {
                            System.out.println("No exite el cliente");
                            break;
                        }

                    }
                    break;
                case 5:
                    System.out.println("ACTIVAR CUENTA");
                    System.out.println("Ingrese numero de cuenta: ");
                    nroCuenta = sc.nextInt();
                    existe=false;
                    for (int i = 0; i < cliente.size() && existe==false; i++) {
                        if (cliente.get(i).getNroCuenta() == nroCuenta) {
                            cliente.get(i).activarCuenta();
                            existe=true;
                            System.out.println("La cuenta se activo");
                           }
                    }
                    if (!existe)
                        System.out.println("No existe la cuenta");
                    break;
                case 6:
                    System.out.println("DESACTIVAR CUENTA");
                    System.out.println("Ingrese numero de cuenta: ");
                    nroCuenta = sc.nextInt();
                    existe=false;
                    for (int i = 0; i < cliente.size() && existe==false; i++) {
                        if (cliente.get(i).getNroCuenta() == nroCuenta) {
                            cliente.get(i).desactivarCuenta();
                            existe=true;
                            System.out.println("La cuenta se desactivo");
                        }
                    }
                    if (!existe)
                        System.out.println("No existe la cuenta");
                    break;
                case 7:
                    System.out.println("MOSTRAR DATOS");
                    for (int i = 0; i < cliente.size(); i++) {
                        System.out.println(cliente.get(i).toString());
                    }
                break;
            }
        } while (op != 0);
        int i = 0;
    }

}
