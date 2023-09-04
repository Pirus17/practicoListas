/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eListas4;

/**
 *
 * @author Piruxb17
 */
public class Cuenta {

    private int nroCuenta;
    private int dniTitular;
    private String fechaApertura;
    private boolean Activa;
    private float Saldo;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, int dniTitular, String fechaApertura, boolean Activa, float Saldo) {
        this.nroCuenta = nroCuenta;
        this.dniTitular = dniTitular;
        this.fechaApertura = fechaApertura;
        this.Activa = Activa;
        this.Saldo = Saldo;
    }

    /**
     * @return the nroCuenta
     */
    public int getNroCuenta() {
        return nroCuenta;
    }

    /**
     * @param nroCuenta the nroCuenta to set
     */
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    /**
     * @return the dniTitular
     */
    public int getDniTitular() {
        return dniTitular;
    }

    /**
     * @param dniTitular the dniTitular to set
     */
    public void setDniTitular(int dniTitular) {
        this.dniTitular = dniTitular;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the Activa
     */
    public boolean isActiva() {
        return Activa;
    }

    /**
     * @param Activa the Activa to set
     */
    public void setActiva(boolean Activa) {
        this.Activa = Activa;
    }

    /**
     * @return the Saldo
     */
    public float getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean depositar(float monto) {
        if (this.Activa) {
            this.setSaldo(this.Saldo + monto);
            return true;
        } else {
            return false;
        }
    }

    public boolean extraer(float monto) {
        if (this.Activa && this.Saldo >= monto) {
            this.setSaldo(this.Saldo - monto);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Cuenta{" + "nroCuenta=" + nroCuenta + ", dniTitular=" + dniTitular + ", fechaApertura=" + fechaApertura + ", Activa=" + Activa + ", Saldo=" + Saldo + '}';
    }

    

    public void activarCuenta() {
        this.Activa = true;
    }

    public void desactivarCuenta() {
        this.Activa = false;
    }
}
