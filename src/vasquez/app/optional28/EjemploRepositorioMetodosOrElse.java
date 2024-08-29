package vasquez.app.optional28;

import vasquez.app.optional28.models.Computador;
import vasquez.app.optional28.repositorio.ComputadorRepositorio;
import vasquez.app.optional28.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen","LA0001");
        //solo usa el valor y consume más porque crea siempre el valor por defecto
        Computador pc = repositorio.filtrar("asus rog").orElse(valorDefecto());

        System.out.println(pc);
        //usa un lambda sin parametros y consume menos porque crea el valor por defecto cuando es necesario
        pc = repositorio.filtrar("macbook").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);

        System.out.println(pc);

    }

    public static Computador valorDefecto() {
        System.out.println("Obteniendo valor por defecto...");
        return new Computador("HP Omen","LA0001");
    }

}
