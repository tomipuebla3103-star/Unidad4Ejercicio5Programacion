public class UnidadAerea extends UnidadCombate{
    public UnidadAerea(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {

        if (Math.abs(nuevaX - posicionX) <= 5 &&
                Math.abs(nuevaY - posicionY) <= 5) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            System.out.println("La unidad aerea se movio.");
        } else {
            System.out.println("La unidad aerea no puede llegar a esa posicion.");
        }
    }

    @Override
    public void atacar() {
        System.out.println("La unidad aerea realiza un ataque desde el aire.");
    }
}
