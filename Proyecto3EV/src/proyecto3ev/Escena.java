/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ev;

/**
 * Esta interfaz debe ser implementada por todas aquellas clases que quieran
 * servir como 'fabricas' de escenas. 
 * 
 * Una clase que implemente esta interfaz tendra por tanto como objetivo que 
 * cada una de sus instancias represente una escena del juego. La escena,
 * aparte de implementar la funcionalidad de los metodos que aparecen en esta
 * interfaz, debe tambien implementar estructuras de datos (mediante atributos)
 * que permitan almacenar todos los componentes de la escena, entre los que se 
 * incluyen:
 * 
 * - La representacion del grafico de la escena en cadena de caracteres.
 * - La lista de objetos que hay presente en la escena (empiece usando arrays
 * y cuando demos las listas, haga el cambio).
 * - La lista de enemigos que hay presente en la escena (empiece usando arrays
 * y cuando demos las listas, haga el cambio).
 * - Un array de cuatro Escenas con las cuatro posibles salidas que tiene
 * la escena actual segun el jugador quiera desplazarse al Norte, Sur, 
 * Este u Oeste. Cuando no haya una salida en alguna de las direcciones, el 
 * elemento correspondiente del array tendrá que estar a null.
 * 
 * Nota: el grafico puede ser en blanco y negro o a color, como desee.
 * 
 * @author Jorge Juan
 */
public interface Escena {
    
    /**
     * 
     * Imprime la representacion en ASCII de la escena, que incluye el grafico de
     * escena, la descripción de escena y la descripción de los componentes de 
     * escena.
     * 
     * Debe seguirse el siguiente formato: tras las lineas del grafico, debe
     * imprimirse la descripcion de escena. Tras la descripcion de escena, debe
     * imprimirse la descripcion de todos los objetos y enemigos, cada uno en
     * su propia linea.
     */
    void imprimirEscena();
    
    /**
     * 
     * @return La cantidad de enemigos VIVOS que hay en la escena.
     */
    int getNumEnemigos();
    
    /**
     * 
     * @return La cantidad de objetos que hay en la escena SIN RECOGER.
     */
    int getNumObjetos();
    
    /**
     * 
     * @return Las distintas salidas que el usuario puede tomar. Por ejemplo,
     * si la escena tiene las cuatro posibles salidas, devolveria una cadena
     * con el siguiente formato: "Salidas: Norte Sur Este Oeste". Toda escena
     * debe tener como minimo una salida.
     */
    String getSalidas();
    
    /**
     * 
     * @return Un booleano indicando si la escena necesita una llave para que
     * el jugador pueda entrar.
     */
    boolean necesitaLLave();
    
    /**
     * 
     * @param llave La instancia de la llave que abre, o null si el jugador
     * no la tiene en su inventario.
     * 
     * @return Un booleano con el valor true en caso de que la escena tenga una
     * salida al norte, no haya enemigos vivos y el usuario tenga la llave de
     * entrada a esa escena (esta ultima condicion solo se aplica en caso de que la escena
     * destino necesite una llave para entrar). Devuelve false en cualquier otro
     * caso.
     */
    boolean norteDespejado(Descriptible llave);
    
    /**
     * 
     * @param llave La instancia de la llave que abre, o null si el jugador
     * no la tiene en su inventario.
     * 
     * @return Un booleano con el valor true en caso de que la escena tenga una
     * salida al sur, no haya enemigos vivos y el usuario tenga la llave de
     * entrada a esa escena (esta ultima condicion solo se aplica en caso de que la escena
     * destino necesite una llave para entrar). Devuelve false en cualquier otro
     * caso.
     */
    boolean surDespejado(Descriptible llave);
    
    /**
     * 
     * @param llave La instancia de la llave que abre, o null si el jugador
     * no la tiene en su inventario.
     * 
     * @return Un booleano con el valor true en caso de que la escena tenga una
     * salida al este, no haya enemigos vivos y el usuario tenga la llave de
     * entrada a esa escena (esta ultima condicion solo se aplica en caso de que la escena
     * destino necesite una llave para entrar). Devuelve false en cualquier otro
     * caso.
     */
    boolean esteDespejado(Descriptible llave);
    
    /**
     * 
     * @param llave La instancia de la llave que abre, o null si el jugador
     * no la tiene en su inventario.
     * 
     * @return Un booleano con el valor true en caso de que la escena tenga una
     * salida al noroeste, no haya enemigos vivos y el usuario tenga la llave de
     * entrada a esa escena (esta ultima condicion solo se aplica en caso de que la escena
     * destino necesite una llave para entrar). Devuelve false en cualquier otro
     * caso.
     */
    boolean noroesteDespejado(Descriptible llave);
    
    /**
     * 
     * @param nombre El nombre de la cosa que se quiere examinar.
     * 
     * @return La informacion de la cosa, o null en caso de que dicha cosa no
     * exista en la escena.
     */
    String examinarCosa(String nombre);
}
