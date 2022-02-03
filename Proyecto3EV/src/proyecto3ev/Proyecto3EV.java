/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ev;

/**
 *
 * Por lo general, este codigo no debe ser alterado, salvo para crear en la
 * linea 26 la instancia de tu clase que representa al juego.
 * 
 * Si cree que este proyecto tiene algun error o si necesita hacer cambios
 * para que se adapte a su juego, puede hacerlo. Pero asegurese antes que cualquier
 * error de ejecucion no venga de su propio codigo.
 *
 * @author Jorge Juan
 */
public class Proyecto3EV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego game = new LaVerdadSobreLaIglesia/* aqui tantos argumentos como necesite tu constructor */);
        game.mostrarPortada(); // Comenzamos mostrando la portada.
        game.elegirPersonaje(); // Mostramos opciones y elegimos personaje.
        Escena escenaActual = game.getEscenaActual();
        Escena escenaSiguiente = escenaActual;
        // Mientras el juego no acabe.
        while (!game.fin()) {
            // Mostramos la escena en la que se encuentra el jugador
            game.mostrarEscena();
            // Mientras no haya cambio de escena, seguimos en la misma, leemos y ejecutamos comando.
            while (escenaActual.equals(escenaSiguiente)) {
                // Si la accion leida y ejecutada no implica cambio de escena,
                // leerAccionYEjecutar debe devolver la escena actual para evitar salir del bucle.
                escenaSiguiente = game.leerAccionYEjecutar();
            }
            // Si se sale del bucle interno, es porque
            // la accion implica cambio de escena. La escena actual pasa a ser
            // la siguiente.
            game.entrarEn(escenaSiguiente);
            escenaActual = escenaSiguiente;
        }

        if (game.getJugador().getSalud() > 0) {
            System.out.println("Enhorabuena, te has pasado el juego!!!!");
        } else {
            System.out.println("+++++GAME OVER+++++");
        }

    }

}
