public class Caballeria extends UnidadCombate{
    public Caballeria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {

        if (Math.abs(nuevaX - posicionX) <= 3 &&
                Math.abs(nuevaY - posicionY) <= 3) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            System.out.println("La caballeria se movio.");
        } else {
            System.out.println("La caballeria no puede llegar a esa posicion.");
        }
    }

    @Override
    public void atacar() {
        System.out.println("La caballeria realiza una carga.");
    }
}
