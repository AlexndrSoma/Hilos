/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author alex
 */
public class Cliente {
    
	private String nombre;
	private int[] transacciones;

	// Constructor, getter y setter
        
        public Cliente (){
            
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] geTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int[] carroCompra) {
        this.transacciones = carroCompra;
    }
    
    public Cliente(String nombre, int[] transacciones){
        this.nombre=nombre;
        this.transacciones=transacciones;
        
    }

}
    


