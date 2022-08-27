/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.*;

/**
 * Esta clase tiene como objetivo leer los datos presentes en un archivo de
 * texto con extensión .txt
 *
 */
public class Archivos {

    /**
     * Método main que lee un archivo de texto y muestra su contenido en
     * pantalla
     *
     * @throws IOException Excepción que indica que no se pudo leer el archivo
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        String nombreArchivo = "C:/prueba.txt";
        /* Definición del archivo de texto a leer */
        FileInputStream archivo; // Definición de flujo de datos
        InputStreamReader conversor; // Definición del flujo de lectura
        BufferedReader filtro; // Definición del buffer
        String línea;
        /* Crea los objetos FileInputStream, BufferedReader y BufferedReader */
        try {
            archivo = new FileInputStream(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra");
        }catch (IOException e){
            System.err.println("El programa fallo");
        }catch(Exception e){
            System.err.println("El programa fallo");
        } finally {
            System.out.println("Finalizar programa");
        }
        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        línea = filtro.readLine();
        while (línea != null) {
            System.out.println(línea);
            /* Imprime en pantalla una línea del archivo */
            línea = filtro.readLine(); // Lee la siguiente línea 
        }
        filtro.close(); // Cierra el archivo
    }
}
