package projet_interface;

import java.time.LocalDate;

public class Automobile extends Vehicule implements Assurable{
    public Automobile(double valeur, int anneeModele, Proprietaire pr, String numeroPlaque) {
        super(valeur, anneeModele, pr, numeroPlaque);
    }

    @Override
    public boolean estAssurable(){
        Proprietaire pr = getPr();
        LocalDate now = LocalDate.now();
        boolean mineur = now.minusYears(21).isBefore(pr.getDate());
        if(!mineur && getNumeroPlaque().charAt(0) != 'T'){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double coutAssurance(){
        double cout = 0;
        cout = Assurable.POURCENT_TAXE * getValeur();
        if (getPr().getVille() == "Montréal"){
            cout += cout * 0.06;
        }
        return cout;
    }
}
