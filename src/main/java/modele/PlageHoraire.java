package modele;

public class PlageHoraire {
    private Horaire chHoraire1;
    private Horaire chHoraire2;
    private static final Horaire MINIMUM = new Horaire(0,15);

    public PlageHoraire(Horaire parHoraire1, Horaire parHoraire2) {
        chHoraire1 = parHoraire1;
        chHoraire2 = parHoraire2;
    }
    public Horaire debut() {
        return chHoraire1;
    }
    public Horaire fin() {
        return chHoraire2;
    }

    public String toString() {
        return chHoraire1 + " - " + chHoraire2 +", durée : " + duree().getHeure()+"h"+duree().getQuartHeure();
    }

    public boolean estValide(){
        if (chHoraire1.toMinutes()<MINIMUM.toMinutes())
            return false;
        if ((chHoraire1.getHeure() < 0 || chHoraire2.getHeure() < 0) || (chHoraire1.getHeure() > 24 || chHoraire2.getHeure() > 24))
            return false;
        if ((chHoraire1.getQuartHeure() < 0 || chHoraire2.getQuartHeure() < 0) || (chHoraire1.getQuartHeure() >= 60 || chHoraire2.getQuartHeure() >= 60)) return false;
        if ((chHoraire1.getQuartHeure() % 15 != 0) || (chHoraire2.getQuartHeure() % 15 != 0))
            return false;
        if (chHoraire1.toMinutes() < chHoraire2.toMinutes())
            return false;
        return true;
    }

    public Horaire duree(){
        return new Horaire(chHoraire2.getHeure() - chHoraire1.getHeure(), chHoraire2.getQuartHeure() - chHoraire1.getQuartHeure());
    }

    public int compareTo(PlageHoraire plageHorraire2) {
        if (this.fin().toMinutes() < plageHorraire2.debut().toMinutes())
            return -1;
        if (plageHorraire2.fin().toMinutes() < this.debut().toMinutes())
            return 1;
        return 0;
    }


}