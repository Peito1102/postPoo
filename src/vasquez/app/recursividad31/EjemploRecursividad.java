package vasquez.app.recursividad31;

import vasquez.app.recursividad31.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SSD 2T");

        cpu.add(ventilador).add(disipador);
        tv.add(gpu).add(gpuRam).add(gpuRam2).add(gpuVentiladores);
        placaMadre.add(cpu).add(tv).add(ram).add(ssd);
        pc.add(poder).add(placaMadre).add(new Componente("Teclado")).add(new Componente("Mouse"));

        metodoRecursivoJava8(pc,0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),c.getHijos().stream()
                .flatMap(hijo -> metodoRecursivoJava8(hijo,nivel+1)));
    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijo()) {
            for (Componente hijo: c.getHijos()) {
                metodoRecursivo(hijo,nivel+1);
            }
        }
    }
}
