import java.util.ArrayList;
import java.util.Scanner;

enum Categoria { SUPERIOR, INFERIOR, CALZADO, ACCESORIO; }

abstract class Prenda {
    String tipo;
    String material;
    String color;
    String colorSecundario;

    public Prenda cargarPrenda() {
        Prenda prenda = nuevaPrenda();
        prenda.indicarTipo();
        prenda.elegirMaterial();
        prenda.elegirColor();
        prenda.elegirColorSecundario();

        return prenda;
    }

    public static int seleccionarCategoria() {
        System.out.println("Seleccione categoria:");
        System.out.print("1. Prenda superior");
        System.out.print("2. Prenda inferior");
        System.out.print("3. Calzado");
        System.out.print("4. Accesorio");

        try { 
            Scanner scan = new Scanner(System.in);

            int eleccion = scan.nextInt();
            scan.close();
            return eleccion;
        }
        catch (IllegalArgumentException tipoErroneo) {
            System.out.println("Se introdujo un valor invalido.");
            return 0;
        }      
    }

    void elegirMaterial() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Indique material:");

            this.material = scan.nextLine();
            scan.close();
        }
        catch (IllegalArgumentException tipoErroneo) {
            System.out.println("Se introdujo un valor de material invalido.");
        }
    }

    void elegirColor() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Indique color:");

            this.color = scan.nextLine();
            scan.close();
        }
        catch (IllegalArgumentException tipoErroneo) {
            System.out.println("Se introdujo un valor de color invalido.");
        } 
    }

    void elegirColorSecundario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desea agregar un color secundario?");

        boolean deseaColorSecundario = scan.nextBoolean();
        if (deseaColorSecundario) {
            try {
                System.out.println("Indique color secundario:");

                this.colorSecundario = scan.nextLine();
                scan.close();
            }
            catch (IllegalArgumentException tipoErroneo) {
                System.out.println("Se introdujo un valor de color invalido.");
            }
        }
    }

    void indicarTipo() {
        // Solicitaria que usuario seleccione de la lista tiposCompatibles (de las subclases) un tipo.
    }

    abstract Prenda nuevaPrenda();

}

class PrendaSuperior extends Prenda {
    ArrayList<String> tiposCompatibles = new ArrayList<>();

    Prenda nuevaPrenda() {
        return new PrendaSuperior();
    }
}

class PrendaInferior extends Prenda {
    ArrayList<String> tiposCompatibles = new ArrayList<>();

    Prenda nuevaPrenda() {
        return new PrendaInferior();
    }
}

class Calzado extends Prenda {
    ArrayList<String> tiposCompatibles = new ArrayList<>();

    Prenda nuevaPrenda() {
        return new Calzado();
    }
}

class Accesorio extends Prenda {
    ArrayList<String> tiposCompatibles = new ArrayList<>();

    Prenda nuevaPrenda() {
        return new Accesorio();
    }
}