import java.util.*;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        detectorVocales("Habia una vez una persona muy buena y poco a poco se volvio el en un guerrero"); //prob1
        System.out.println();

        invertirTexto("Hola");
        System.out.println();

        System.out.println(esParidromo("hola"));
        System.out.println(esParidromo("ama"));
        System.out.println();

        contarPalabras("Hola        amigos de iutu sdas");
        System.out.println();

        System.out.println(reemplazarCaracter("pom pom",'o','u'));
        System.out.println();

        System.out.println(eliminarEspacios("Hola papi como estais?"));
        System.out.println();

        System.out.println(contarOcurrencias("abcabcabc","abc"));
        System.out.println();

        System.out.println(compararCadenasIgnorarCase("hola","HOLA"));
        System.out.println();

        System.out.println("La cadena más larga en común es: " +
                subcadenaComunMasLarga("hola papaseto , eres extremadamente gosu","hola papaseto , eres extremadamente gosu"));
        System.out.println();

        ordenarPalabras("Hola mi rey que haces?");
        System.out.println();

        System.out.println(cantCaractersUnicos("aabbccddljgdfou"));
        System.out.println();

        System.out.println(contarCaracteresUnicos("aabbccddljgdfou"));
    }

    //metodo12
    public static long contarCaracteresUnicos(String str) {
        return str.chars().distinct().count();
    }

    //metodo11
    public static int cantCaractersUnicos(String texto) {
        char [] caracters = texto.toLowerCase().replaceAll("\\s+","").toCharArray();
        Set<Character> noDobles = new HashSet<>();
        for (char c : caracters) {
            noDobles.add(c);
        }

        return noDobles.size()-(caracters.length-noDobles.size());
    }

    //metodo10
    public static void ordenarPalabras(String str) {
        String[] palabras = str.split("\\s+");
        Arrays.sort(palabras);
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    //metodo9
    public static String subcadenaComunMasLarga(String texto1, String texto2) {
        //yo lo entendi de esta forma
        String [] palabras = texto1.split("\\s+");
        String cadMasLarga = "";

        for (String p : palabras) {
            if (texto2.contains(p)) {
                if (cadMasLarga.length() < p.length()){
                    cadMasLarga = p;
                }
            }
        }

        return cadMasLarga;
    }

    //metodo8
    public static boolean compararCadenasIgnorarCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    //metodo7
    public static int contarOcurrencias(String str, String subcadena) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(subcadena, idx)) != -1) {
            count++;
            idx += subcadena.length();
        }
        return count;
    }

    //metodo6
    public static String eliminarEspacios(String texto) {
        String txtJunto = texto.replaceAll("\\s+","");
        return txtJunto;
    }

    //metodo5
    public static String reemplazarCaracter(String texto, char original, char reemplazo) {
        return texto.replace(original, reemplazo);
    }

    //metodo4
    public static void contarPalabras(String texto) {
        String txtArreglado = texto.replaceAll("\\s+"," ");
        String [] txtSeparado = txtArreglado.split(" ");
        System.out.println("Hay " + txtSeparado.length + " palabras");
    }

    //metodo3
    public static String esParidromo(String texto) {
        for (int i = 0;i < texto.length()/2;i++) {
            if (texto.charAt(i) != texto.charAt(texto.length()-1-i)) return "No es palindromo.";
        }
        return "Es palindromo.";
    }

    //metodos2
    public static void invertirTexto(String texto) {
        //forma1
        StringBuilder txtInverso = new StringBuilder();
        for (int i = texto.length()-1; i >= 0;i--) {
            txtInverso.append(texto.charAt(i));
        }

        //forma2
        /*
        txtInverso.reverse().toString();
        */

        System.out.println(txtInverso);
    }

    //metodos 1
    public static void detectorVocales(String texto) {
        char [] vocales = {'a','e','i','o','u'};
        for (char c: vocales) {
            System.out.println("Hay " + cantidad(texto,c) + " vocales \'" + c + "\'");
        }
    }

    public static int cantidad(String texto,char vocal) {
        int cant = 0;
        while (!texto.isEmpty()) {
            if (texto.indexOf(vocal) != -1) {
                cant++;
                texto = texto.substring(texto.indexOf(vocal) + 1);
            } else texto = "";
        }

        return cant;
    }
}
