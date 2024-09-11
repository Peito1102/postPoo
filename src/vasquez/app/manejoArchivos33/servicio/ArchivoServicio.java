package vasquez.app.manejoArchivos33.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            //con este adicionas contenido
            //FileWriter escritor = new FileWriter(archivo,true);
            buffer.append("Hola mi rey,").append(" que me cuentas?");
            buffer.close();
            System.out.println("El archivo se creó con exito.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        //otra forma de usar el try y tambien no es necesario usar el buffer.close()
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo,true))){
            buffer.println("Hola mi rey,");
            buffer.printf(" que me cuentas?");
            //buffer.close();
            System.out.println("El archivo se creó con exito.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }
}
