/**
 *Définir une classe générique comportant deux types inconnus.
 */

public class DoubleGenerique<W, V> {

    V u1; // Attribut de type générique

    public DoubleGenerique(V valeur) {
        u1 = valeur;
    }


    public W toSubType() {
// Possibilité de réaliser des opérations menant à récupérer un objet de type W.
        return null;
    }

    //public static W toSubTypeStatic(V v) {return null; } // impossible car static !
}