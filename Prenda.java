abstract class Prenda {
    TipoPrenda tipo;
    String material;
    String color;
    String colorSecundario;

    public static Prenda cargarPrenda() {
        Prenda prenda = this.nuevaPrenda();
        prenda.indicarTipo();
        prenda.elegirMaterial();
        prenda.elegirColor();
        prenda.elegirColorSecundario();

        return prenda;
    }

    abstract Prenda nuevaPrenda();
}

class PrendaSuperior extends Prenda {
    Prenda nuevaPrenda() {
        return new PrendaSuperior();
    }
}

class PrendaInferior extends Prenda {
    Prenda nuevaPrenda() {
        return new PrendaInferior();
    }
}

class Calzado extends Prenda {
    Prenda nuevaPrenda() {
        return new Calzado();
    }
}

class Accesorio extends Prenda {
    Prenda nuevaPrenda() {
        return new Accesorio();
    }
}