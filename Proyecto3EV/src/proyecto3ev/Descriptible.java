/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ev;

/**
 * Esta interfaz debe ser implementada por todas aquellas clases cuyas instancias
 * sean susceptibles de poder ser examinadas por el jugador para obtener su 
 * descripción.
 * 
 * Tipicamente, esta interfaz seria implementada por las clases que implementen
 * objetos, enemigos y escenas, con el proposito que todas puedan devolver una
 * cadena con el nombre del objeto y su descripcion. Dicha informacion sera
 * especifica para cada instancia, de forma que cada instancia tendra almacenada
 * dicha informacion en un atributo cuyo valor se configura al usar el constructor
 * de la clase.
 * 
 * @author Jorge Juan
 */
public interface Descriptible {
    
    /**
     * 
     * @return Una cadena con el nombre del objeto. Por ejemplo: "llave2",
     * "pocion3", "guardia5", "escena2".
     */
    String getNombre();
    
    /**
     * 
     * @return Una cadena con informacion detallada del objeto. Por ejemplo:
     * "una llave muy bonita de oro en el suelo", "una pocion magica que restaura
     * 20 puntos de salud","un guardia enorme. Esta mas muerto que tu bisabuela". 
     * En caso de ser un enemigo, debera incluirse informacion adicional si esta muerto, como en el caso 
     * anterior.
     */
    String getInformacion();
    
    /**
     * 
     * @return Una cadena con el nombre y descripcion del objeto concatenados,
     * siguiendo el siguiente formato: "Ves: llave2->una llave muy bonita de oro en el 
     * suelo.", "Ves: pocion3->una pocion magica que restaura 20 puntos de salud.", 
     * "Ves: guardia5->un guardia enorme. Esta mas muerto que tu bisabuela."
     * En el caso de una escena, puede devolver el texto que acompaña al grafico.
     */
    String examinar();
}
