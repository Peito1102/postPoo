package vasquez.app.lambda26;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        //recibe parametro y retorna
        Function<String,String> funcion = param -> "Hola papi " + param;
        String resultado = funcion.apply("JD");
        System.out.println(resultado);

        Function<String,String> funcion2 = String::toUpperCase;
        System.out.println(funcion2.apply("lizu"));

        BiFunction<String,String,String> function3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String resultado2 = function3.apply("Pepito ", "jotade");
        System.out.println(resultado2);

        BiFunction<String,String,Integer> function4 = String::compareTo; //(a,b) -> a.compareTo(b);
        System.out.println(function4.apply("pepito","pepito"));

        BiFunction<String,String,String> function5 = String::concat; //(a,b) -> a.concat(b);
        System.out.println(function5.apply("jd ","lizu"));
    }
}
