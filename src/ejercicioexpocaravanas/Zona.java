/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexpocaravanas;

/**
 *
 * @author Miguel Gadea Fernández-Giro
 */
public class Zona {
    private int entradasalaventa ;

    public Zona() {
    }

    public Zona(int entradasalaventa) {
        this.entradasalaventa = entradasalaventa;
    }

    public int getEntradasalaventa() {
        return entradasalaventa;
    }

    public void setEntradasalaventa(int entradasalaventa) {
        this.entradasalaventa = entradasalaventa;
    }
    public void ventaEntradas (int entradasventa){
        entradasalaventa=entradasalaventa-entradasventa;
        
    }
    
}
