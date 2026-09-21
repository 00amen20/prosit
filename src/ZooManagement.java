import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        // Instruction 1 : Création et initialisation des variables
        int nbrCages = 20;
        String zooName = "my zoo";

        // Affichage initial
        System.out.println("Bienvenue dans " + zooName
                + " qui contient " + nbrCages + " cages.");

        // Instruction 2 : Interaction avec l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Saisie du nom du zoo
        String nom;
        do {
            System.out.print("Entrez le nom du zoo : ");
            nom = scanner.nextLine().trim();

            if (nom.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            }

        } while (nom.isEmpty());

        zooName = nom;

        // Saisie du nombre de cages
        int cages;

        while (true) {
            System.out.print("Entrez le nombre de cages : ");

            if (scanner.hasNextInt()) {
                cages = scanner.nextInt();

                if (cages > 0) {
                    nbrCages = cages;
                    break;
                } else {
                    System.out.println(
                            "Erreur : le nombre de cages doit être un entier positif."
                    );
                }

            } else {
                System.out.println(
                        "Erreur : veuillez entrer un nombre entier."
                );
                scanner.next();
            }
        }

        // Instruction 3 : Affichage après modification
        System.out.println();
        System.out.println("=================================");
        System.out.println("Informations du zoo :");
        System.out.println("Nom du zoo : " + zooName);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("=================================");

        scanner.close();
    }
}