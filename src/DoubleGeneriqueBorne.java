
public class DoubleGeneriqueBorne<V extends Tomate &
        Comparable<V>, W extends Legume> {
    V u1; // Attribut de type générique

    public DoubleGeneriqueBorne(V valeur) {
        u1 = valeur;
    }

    public int comparer(V v1, V v2) {
        return v1.compareTo(v2);
    }

    public W calculer(V v) {
        // traitements conduisant à renvoyer un légume, par exemple:
        return (W)v; // possible car Tomate extends Legume
    }}