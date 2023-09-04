/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eLista5;

/**
 *
 * @author Piru
 */
public class empleados {
 private String nombre;
 private String apellido;
 private int categoria;
 private int horasTrabajadas;
 private float sueldo;

    public empleados() {
    }

   
     

    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
        public void AumentoSueldo(){
     switch (this.categoria){
         case 1:
             if(horasTrabajadas>4 && horasTrabajadas<6)
             
             setSueldo((float) (this.getSueldo()*1.3));
             else 
             setSueldo((float) (this.getSueldo()*1.4));    
             break;
         case 2:
             if(horasTrabajadas>4 && horasTrabajadas<6)
             
             setSueldo((float) (this.getSueldo()*1.15));
             else 
             setSueldo((float) (this.getSueldo()*1.25));    
             break;
        case 3:
             if(horasTrabajadas>4 && horasTrabajadas<6)
             
             setSueldo((float) (this.getSueldo()*1.1));
             else 
             setSueldo((float) (this.getSueldo()*1.13));    
             break;
        case 4:
             if(horasTrabajadas>4 && horasTrabajadas<6)
             
             setSueldo((float) (this.getSueldo()*1.04));
             else 
             setSueldo((float) (this.getSueldo()*1.05));    
             break;
             
     }
 
 }

}