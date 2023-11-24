/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author sergi
 */
public abstract class Router implements ConexionRed {
    
    public void configurarRed(){
        System.out.println("Se está configurando la Red");
    }
    
    @Override
    public void conectar (){
        System.out.println("Se hizo la conexion del router");
  
    }
    
    @Override
    public void desconectar(){
        System.out.println("Se hizo desconexion del router");
    }
    
}
