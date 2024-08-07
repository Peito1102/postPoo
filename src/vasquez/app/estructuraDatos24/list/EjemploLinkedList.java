package vasquez.app.estructuraDatos24.list;

import org.xml.sax.helpers.AttributeListImpl;
import vasquez.app.estructuraDatos24.modelo.Alumno;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList { //Obs: Set puede usar todos las iteraciones como el List menos el for clasico.
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada.size());
        System.out.println(enlazada.isEmpty());

        enlazada.add(new Alumno("JD",10));
        enlazada.add(new Alumno("Piero",8));
        enlazada.add(new Alumno("Renzo",2));
        enlazada.add(2, new Alumno("Pepito",5));
        enlazada.add(new Alumno("Joel",0));
        enlazada.add(new Alumno("Tomate",8));
        enlazada.add(new Alumno("Lizu",4));
        enlazada.add(new Alumno("Robotin",7));
        System.out.println(enlazada);

        System.out.println(enlazada.size());

        enlazada.addFirst(new Alumno("Esha", 5));
        enlazada.addLast(new Alumno("Aquesha", 6));
        System.out.println(enlazada.size());
        System.out.println(enlazada);

        System.out.println("Primero : " + enlazada.getFirst());
        System.out.println("Ultimo: " + enlazada.getLast());

        System.out.println("Indice 2: " + enlazada.get(2));

        System.out.println(enlazada);
        //el remove elimina y retorna un error si esta vacio el array
        System.out.println(enlazada.remove(3));
        System.out.println(enlazada.removeFirst());
        //pop y removeFirst con iguales
        //System.out.println(enlazada.pop());
        System.out.println(enlazada.removeLast());
        System.out.println();
        //el poll elimina y retorna null si esta vacio el array
        System.out.println(enlazada.poll());
        System.out.println(enlazada.pollFirst());
        System.out.println(enlazada.pollLast());

        System.out.println();
        //obtienen elemento pero el peek retorna null si esta vacio
        System.out.println(enlazada.peekFirst());
        System.out.println(enlazada.peekLast());
        System.out.println(enlazada.getFirst());
        System.out.println(enlazada.getLast());
        System.out.println();

        ListIterator<Alumno> li = enlazada.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

    }

}
