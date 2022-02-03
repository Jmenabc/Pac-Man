/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ev;

/**
 *
 * Esta interfaz debe ser implementada por todas aquellas clases que representen
 * entidades capaces de pelear.
 * 
 * Es necesario que su juego desarrolle una jerarquia de clases que permita
 * al jugador elegir entre tres clases distintas de personaje antes de empezar
 * a jugar. Por ejemplo, en un juego de rol clasico esas clases suelen ser
 * guerrero, mago y ladron. Lo que diferencia unas de otras es la cantidad de
 * puntos de ataque, defensa y salud que tienen. Normalmente los guerreros son 
 * los que tienen mas ataque y salud, los magos los que tienen mas defensa, y 
 * los ladrones son el punto intermedio. 
 * 
 * Debe tambien desarrollar la jerarquia de clases de los enemigos, con al menos
 * dos razas, totalmente separadas de las clases del personaje principal.
 * 
 * Puede implementar cosas adicionales
 * si se ve con capacidad: por ejemplo, los magos pueden usar pociones para 
 * restaurar salud, los ladrones pueden hacer el doble de daño en el primer
 * ataque, los trolls regeran vida tras cada turno, etc., pero esto no es un 
 * requisito (se valorara muy positivamente).
 * 
 * @author Jorge Juan
 */
public interface Luchador {
    
    /**
     * 
     * Consultar la implementacion de Pokemon.
     * 
     * @param objetivo 
     */
    void atacar(Luchador objetivo);
    
    /**
     * 
     * Consultar la implementacion de Pokemon.
     * 
     * @param ataqueEnemigo 
     */
    void recibirDaños(int ataqueEnemigo);
    
    /**
     * 
     * @return true si la salud de la entidad es mayor que cero, false
     * en cualquier otro caso.
     */
    boolean estaVivo();
    
    /**
     * 
     * Consultar la implementacion de Pokemon.
     * 
     * @return 
     */
    int getAtaque();
    
    /**
     * 
     * Consultar la implementacion de Pokemon.
     * 
     * @return 
     */
    int getDefensa();
    
    /**
     * 
     * Consultar la implementacion de Pokemon.
     * 
     * @return 
     */
    int getSalud();
    
}
