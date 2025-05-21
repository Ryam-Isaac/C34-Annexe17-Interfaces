
package projet_interface;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Proprietaire {

    private String villeRes;
    private LocalDate dateNaissance;

    public Proprietaire(String villeRes, LocalDate dateNaissance)
    {
        this.villeRes = villeRes;
        this.dateNaissance = dateNaissance;
    }

    public LocalDate getDate ()
    {
        return dateNaissance;
    }
    public String getVille()
    {
        return villeRes;
    }
}
