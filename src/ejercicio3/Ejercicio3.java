/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio3 {

    public static void calcularValorInventario() throws FileNotFoundException {
//        System.out.println("");
//        System.out.println("Ejercicio 3");
//        System.out.println("");
//        System.out.println("Escribe un programa en Java que lea un archivo de texto llamado \"datos.txt\" \nque contiene información sobre productos (nombre, precio y cantidad en stock). \nCalcula el valor total del inventario y guarda el resultado en un nuevo archivo llamado \"inventario.txt\".\n");
//        // Implementa la lógica del ejercicio 3 aquí

        String nombreArchivo = "datos.txt";
        String nuevoArchivo = "inventario.txt";
        double totalInventario = 0;
        try ( BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(",");

                double precio = Double.parseDouble(datos[1]);
                double cantidad = Double.parseDouble(datos[2]);

                totalInventario = totalInventario + (precio * cantidad);
                

            }
            System.out.println(totalInventario);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoArchivo))) {

            writer.write("El valor total del inventario es: " + totalInventario);

            System.out.println("Archivo generado con éxito ");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}
