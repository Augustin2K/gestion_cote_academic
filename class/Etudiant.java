import java.util.List;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String numero;
    private List<Matiere> matieres;

    public Etudiant(String nom, String numero){
        this.matieres = new ArrayList<Matiere>();
        this.nom = nom;
        this.numero = numero;
        System.out.println("Un Etudiant a ete cree");
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom  = nom;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNomero(String numero){
        this.numero = numero;
    }

    public void ajouterMatiere(String intitule, int coefficient, double note){
        Matiere matiere = new Matiere(intitule, coefficient);
        matiere.setNote(note);
        matieres.add(matiere);
        
    }

    public double calculerMoyenne(){ 
        int somme = 0;

            for(int i = 0; i < matieres.size(); i++){
                 somme += matieres.get(i).getNote() * matieres.get(i).getCoefficient();
            }
        return (somme/matieres.size());
    }

    public void affiche(){
        Matiere str;
        for(int i = 0; i < matieres.size(); i++){
            str = matieres.get(i);
            System.out.println(str.toString());
        }
    }

    public String toString(){
        return "L'Etudiant "+ this.nom +" ayant le numero "+ this.numero +" a une moyenne de "+ this.calculerMoyenne();
    }

}
