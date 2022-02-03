/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ev;

/**
 * Cada clase que implemente esta interfaz representara un juego especifico.
 * 
 * Las clases deben tener una lista con todas las escenas que componen el juego,
 * una referencia a la escena actual y una referencia a la escena desde la que
 * se entro en la actual. Esto ultimo es necesario para que el jugador tenga
 * la oportunidad de volver por donde vino.
 * 
 * Por lo general, solo tendra una clase que implemente esta interfaz. Esta es 
 * la clase mas dificil, dejela para el ultimo lugar.
 * 
 * @author Jorge Juan
 */
public interface Juego {
    
    /**
     * Este metodo muestra por pantalla o bien una pequeña animacion o bien
     * una portada a color del juego.
     */
    void mostrarPortada();
    
    /**
     * Este metodo muestra un menu donde el jugador puede elegir la clase
     * de su personaje, y muestra por pantalla los atributos del mismo
     * antes de acabar.
     */
    void elegirPersonaje();
    
    /**
     * 
     * @return La escena que se esta mostrando actualmente, la habitacion donde 
     * se encuentra actualmente el jugador. 
     */
    Escena getEscenaActual();
    
    /**
     * 
     * @return La escena anterior a la actual, la habitacion desde donde vino el jugador.
     * 
     * Cuando el juego se inicia por primera vez, dado que el jugador no viene
     * de ninguna otra habitacion, como escena anterior se pondra la actual.
     */
    Escena getEscenaAnterior();
    
    /**
     * 
     * @return La escena final.
     */
    Escena getEscenaFinal();
    
    /**
     * Este metodo debe imprimir la escena actual del juego, es decir el grafico
     * y el texto descriptivo de la misma.
     */
    void mostrarEscena();
    
    /**
     * 
     * @return true en caso de que la escena actual sea igual a la escena final y
     * el jugador siga vivo, true en caso de que el jugador este muerto, false
     * en cualquier otro caso.
     */
    boolean fin();
    
    /**
     * 
     * @return la instancia que representa al jugador.
     */
    Luchador getJugador();
    
    /**
     * 
     * @param nueva La nueva escena con la que se quiere reemplazar la actual, 
     * es decir la habitacion donde quiere entrar el jugador. 
     * 
     * La que hasta ahora era escena actual pasara a ser la anterior.
     * 
     * Nota: no debe comprobar si el jugador sigue vivo, solo limitese a hacer
     * lo que dice la descripcion del metodo.
     */
    void entrarEn(Escena nueva);
    
    /**
     * Con este metodo se leera por teclado la accion que quiere realizar el
     * jugador, se comprobara si es valida y en ese caso, se ejecutara. 
     * 
     * Su juego debe implementar como minimo las siguientes acciones:
     * "ir al destino", "examinar cosa", "usar cosa", "coger cosa", "combatir", 
     * "buscar salidas", "mostrar estado (del jugador)". 
     * Si el jugador introduce una accion erronea, se imprimira un mensaje de error
     * y se volvera a leer otra accion hasta que se introduzca una accion correcta. 
     * Tenga en cuenta los siguientes ejemplos:
     * 
     * "ir al direccion" solo se considerara valida si direccion es alguna de las
     * palabras norte, sur, este u oeste y dicha direccion esta despejada.
     * 
     * "examinar cosa" solo se considerara valida si cosa es la palabra "escena" 
     * (para examinar la escena actual)
     * o si es el nombre de un objeto o enemigo de la escena actual. Tendra por
     * tanto que hacer una busqueda entre los elementos de la escena
     * 
     * "usar cosa" solo se considerara valida si cosa es un objeto del inventario
     * del jugador y no hay enemigos vivos.
     * 
     * "coger cosa" solo se considerara valida si cosa es un objeto de la escena
     * y no hay enemigos vivos.
     * 
     * "combatir" solo se considerara valido si hay enemigos vivos.
     * 
     * "buscar salidas" siempre es valido.
     * 
     * "mostrar estado" siempre es valido.
     * 
     * Nota: para cada una de las posibles acciones, cree un metodo en su clase.
     * 
     * @return La nueva escena en caso de que la accion implique un cambio de
     * habitacion, o la escena actual si la accion no implica cambio.
     * 
     * Ejemplo de accion que implica cambio: "ir al direccion".
     * Ejemplo de accion que no implica cambio: el resto.
     */
    Escena leerAccionYEjecutar();
}
