package iut.bad;

public class Homme {
    // Champs (attributs) privés
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut (sans paramètres)
    public Homme() {
        // Initialisation par défaut
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Méthodes d'accès (getters) pour les attributs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    // Méthode pour afficher les informations de l'Homme
    public void afficherInfos() {
        System.out.println("Nom complet : " + nom + " " + prenom);
        System.out.println("Âge : " + age + " ans");
    }

    // Méthode principale (pour tester la classe)
    public static void main(String[] args) {
        // Création d'un objet Homme avec des valeurs initiales
        Homme homme1 = new Homme("Dupont", "Jean", 30);

        // Affichage des informations
        homme1.afficherInfos();
    }
}
