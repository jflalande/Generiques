import java.util.Vector;

public class GeneriqueToken<V extends Soignant> {

    private V v_;

    public GeneriqueToken(V vendeur) {
        System.out.println("Ce vendeur " + vendeur.getNom()
                + "peut vendre des génériques.");
        v_ = vendeur;
    }

    public GeneriqueToken<? extends V>aiderVendeur() {
        Vector<GeneriqueToken<? extends V>> remplacants = new
                Vector<GeneriqueToken<? extends V>>();
        // ... au moins, on sait que ? extends V !
        return remplacants.elementAt(0);
    }
}