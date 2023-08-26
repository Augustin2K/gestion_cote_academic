import java.util.Scanner;

public class Test {
    static Scanner sc =  new Scanner(System.in);
    
    public static void main(String[] args) {
        char reponse1 = ' ';
        char reponse2 = ' ';
        char choix1 = ' ';
        char choix2 = ' ';

        while1 : do{ // Tant que reponse = 1
            do{
                choix1 = ' ';
                System.out.println("1. Creer un nouvel Etudiant \n2. Quiter ");
                choix1 = sc.nextLine().charAt(0);
                
                if(choix1 != '1' && choix1 != '2'){
                    System.out.println(" Veillez faire un choix entre 1 et 2");
                }
            }while(choix1 != '1' && choix1 != '2');
            
            switch(choix1){
                case '1':
                    System.out.print("Entrez le nom: ");
                    String nom = sc.nextLine();
                    System.out.print("Entrez son numero: ");
                    String numero = sc.nextLine(); 
                    Etudiant etudiant1 = new Etudiant(nom, numero);
                    
                    while2 : do{
                        do{
                            choix2 = ' ';
                            System.out.println("1. Ajouter un cours \n2. Afficher les cours \n3. Retourner au Menu Principal");
                            choix2 = sc.nextLine().charAt(0); 

                            if(choix2 != '1' && choix2 != '2' && choix2 != '3'){
                                System.out.println(" Veillez faire un choix entre 1, 2 et 3");
                            }

                        }while(choix2 != '1' && choix2 != '2' && choix2 != '3');
                        switch(choix2){
                            case '1':
                                System.out.print("Entrez le Nom du cours: ");
                                String nomNom = sc.nextLine();
                                System.out.print("Entrez le Coefficient: ");
                                int coefficient = sc.nextInt();
                                System.out.print("Entrez la note: ");
                                double note = sc.nextInt();
                                etudiant1.ajouterMatiere(nomNom, coefficient, note);

                                break;
                            case '2':
                                etudiant1.affiche();
                                break;
                            case '3':
                                break while2;
                        }do{
                            System.out.println("Voulez vous ajouter ou afficher les cours ? (O/N) ");
                            reponse2 = sc.nextLine().charAt(0);
                        }while(reponse2 != 'O' && reponse2 != 'N');
                    }while(reponse2 == 'O');
                break;
 
                case '2':
                
                    break while1;
               
            }
            do{
                System.out.print("Voulez vous ajoutez un autre etudiant ? (O/N) ");
                reponse1 = sc.nextLine().charAt(0);
            }while(reponse1 != 'O' && reponse1 != 'N');
        } while(reponse1 == 'O');
    }
}
