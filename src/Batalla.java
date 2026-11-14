public class Batalla {
    public void ejecutarAcciones(UnidadCombate[] unidades) {

        for (UnidadCombate unidad : unidades) {

            unidad.moverse(unidad.posicionX + 1, unidad.posicionY + 1);

            unidad.atacar();

            unidad.mostrarPosicion();

            System.out.println("----------------------");
        }
    }
}
