public class Infanteria extends UnidadCombate{
    public Infanteria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {

        if (Math.abs(nuevaX - posicionX) <= 1 &&
                Math.abs(nuevaY - posicionY) <= 1) {

            posicionX = nuevaX;
            posicionY = nuevaY;

            System.out.println("La infanteria se movio.");
        } else {
            System.out.println("La infanteria no puede moverse tan lejos.");
        }
    }

    @Override
    public void atacar() {
        System.out.println("La infanteria realiza un ataque cuerpo a cuerpo.");
    }
}
