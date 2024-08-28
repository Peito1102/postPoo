package vasquez.app.stream27;

import vasquez.app.stream27.models.Factura;
import vasquez.app.stream27.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Renzo","Vasquez");
        Usuario u2 = new Usuario("JD","Flores");

        u1.addFactura(new Factura("Compras Tecnologicas"));
        u1.addFactura(new Factura("Compras Muebeles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook Gamer"));

        List<Usuario> usuarios = Arrays.asList(u1,u2);
        /*usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion()
                        .concat(" : cliente ")
                        .concat(f.getUsuario().toString()))); */

        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)  //lf -> lf.stream()
                .forEach(f -> System.out.println(f.getDescripcion()
                        .concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

        /*for (Usuario u: usuarios) {
            for (Factura f : u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/



    }
}
