/** Class générique simple **/
public class Generique<V> {

    V u1; // Attribut de type générique

    public Generique(V valeur) {
        u1 = valeur;
    }

    public String toString() {
        return u1.toString(); // possible car hérite de Object
        //return u1.intValue(); // impossible ! !
    }

    public static void main(String[] args) {
        Integer i = new Integer(5);
        Generique<Integer> g = new Generique<Integer>(i);
    }
}