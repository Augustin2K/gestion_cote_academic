public class Matiere {
    private String intitule;
    private int coefficient;
    private double note;

    public Matiere(String intitule, int coefficient){
        this.intitule = intitule;
        this.coefficient = coefficient;
        System.out.println("Une Matiere a ete creee");
    }

    public String getIntitule(){
        return this.intitule;
    }

    public void setIntitule(String intitule){
        this.intitule = intitule;
    }

    public int getCoefficient(){
        return this.coefficient;
    }

    public void setCoefficient(int coefficient){
        this.coefficient = coefficient;
    }

    public double getNote(){
        return this.note;
    }

    public void setNote(double note){
        this.note = note;
    } 

    public String toString(){
        return "Ce cours est intitulé: "+ this.intitule + ", de Pondération: "+ this.coefficient;
    }

}
