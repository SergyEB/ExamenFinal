/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author sergi
 */
public abstract class Computadora implements ConexionRed{
    
    
    @Override
    public void conectar (){
        System.out.println("Se hizo la conexion de la computadora");
  
    }
    
    @Override
    public void desconectar(){
        System.out.println("Se hizo desconexion de la computadora");
    }
    
}
