public class QueMePongo {
    public static void main(String[] args) {
        while(true) {           
            switch (Prenda.seleccionarCategoria() - 1) {
                case -1:
                    System.out.println("Hubo un error al elegir categoria, intente nuevamente.");
                    break;
                case SUPERIOR:
                    Prenda nuevaPrendaSuperior = new PrendaSuperior().cargarPrenda();
                    break;
                case INFERIOR:
                    Prenda nuevaPrendaInferior = new PrendaInferior().cargarPrenda();
                    break;
                case CALZADO:
                    Prenda nuevoCalzado = new Calzado().cargarPrenda();
                    break;
                case ACCESORIO:
                    Prenda nuevoAccesorio = new Accesorio().cargarPrenda();
                    break;
            }


            //Condicion de corte
        }

        //Posible generacion de atuendos
    }


}