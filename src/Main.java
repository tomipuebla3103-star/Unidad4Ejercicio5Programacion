//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Infanteria infanteria = new Infanteria(0, 0, 100);

    Caballeria caballeria = new Caballeria(2, 2, 100);

    UnidadAerea unidadAerea = new UnidadAerea(5, 5, 100);

    UnidadCombate[] unidades = {
            infanteria,
            caballeria,
            unidadAerea
    };

    Batalla batalla = new Batalla();

    batalla.ejecutarAcciones(unidades);
}
