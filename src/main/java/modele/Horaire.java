package modele;

public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire(int parHeure, int parQuartHeure) {
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    public int toMinutes() {
        return chHeure*60 + chQuartHeure;
    }

    public int getHeure(){
        return  chHeure;

    }

    public int getQuartHeure () {
        return chHeure;
    }

    public void setHeure (int parHeure){
        chHeure = parHeure;
    }

    public void setQuartHeure (int parQuartHeure){
        chQuartHeure = parQuartHeure;
    }

    public String ToString (){
        return chHeure + "h" + chQuartHeure;
    }

}




