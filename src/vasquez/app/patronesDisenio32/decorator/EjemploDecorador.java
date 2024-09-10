package vasquez.app.patronesDisenio32.decorator;

import vasquez.app.patronesDisenio32.decorator.decorador.MayusculaDecorador;
import vasquez.app.patronesDisenio32.decorator.decorador.ReemplazarEspaciosDecorador;
import vasquez.app.patronesDisenio32.decorator.decorador.ReversaDecorador;
import vasquez.app.patronesDisenio32.decorator.decorador.SubrayadoDecorador;

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
