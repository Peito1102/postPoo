package vasquez.app.patronesDisenio.decorator;

import vasquez.app.patronesDisenio.decorator.Formateable;
import vasquez.app.patronesDisenio.decorator.Texto;
import vasquez.app.patronesDisenio.decorator.decorador.MayusculaDecorador;
import vasquez.app.patronesDisenio.decorator.decorador.ReemplazarEspaciosDecorador;
import vasquez.app.patronesDisenio.decorator.decorador.ReversaDecorador;
import vasquez.app.patronesDisenio.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola rey que tal?");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayado);

        System.out.println(reemplazar.darFormato());
    }
}
