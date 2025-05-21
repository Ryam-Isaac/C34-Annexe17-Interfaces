package projet_interface;

import java.time.LocalDate;

public class Motoneige extends Vehicule implements Assurable{
    private int cc;

    // motoneige herite de vehicule 
    public Motoneige(double valeur, int anneeModele, Proprietaire pr, String numeroPlaque, int cc){
        super(valeur, anneeModele, pr, numeroPlaque);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public boolean estAssurable() {
        if (getCc() > 600) {
            return false;
        }
        return true;
    }

    
    @Override
    public double coutAssurance() {
        LocalDate now = LocalDate.now();
        return 500 - (now.getYear() - getAnneeModele())*25;
    }
}
