/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

/**
 *
 * @author 50232
 */
public class Cliente {
    private Long numeroid;
    private String nombre;
    private String adress;

    public Cliente() {
    }

    public Cliente(Long numeroid, String nombre, String adress) {
        this.numeroid = numeroid;
        this.nombre = nombre;
        this.adress = adress;
    }

    public Long getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(Long numeroid) {
        this.numeroid = numeroid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroid=" + numeroid + ", nombre=" + nombre + ", adress=" + adress + '}';
    }
            
    
}
