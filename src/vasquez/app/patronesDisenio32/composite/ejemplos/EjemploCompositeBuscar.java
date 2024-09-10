package vasquez.app.patronesDisenio32.composite.ejemplos;

import vasquez.app.patronesDisenio32.composite.Archivo;
import vasquez.app.patronesDisenio32.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-compositive-docx"));
        Directorio stream = new Directorio("API stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-compositive-docx");
        System.out.println("Encontrado \"patron-compositive-docx\": " + encontrado);

        encontrado = doc.buscar("api stream");
        System.out.println("Encontrado \"api stream\": " + encontrado);

        encontrado = doc.buscar("logo.jpg");
        System.out.println("Encontrado \"logo.jpg\": " + encontrado);
    }
}
