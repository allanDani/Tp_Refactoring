package iut.bad;

public class Femme {
    // Champs (attributs) privés
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut (sans paramètres)
    public Femme() {
        // Initialisation par défaut
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Femme(String nom, String prenom, int age) {
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

    // Méthode pour afficher les informations de la Femme
    public void afficherInfos() {
        System.out.println("Nom complet : " + nom + " " + prenom);
        System.out.println("Âge : " + age + " ans");
    }

    // Méthode principale (pour tester la classe)
    public static void main(String[] args) {
        // Création d'une instance de Femme avec des valeurs initiales
        Femme femme1 = new Femme("Dupont", "Marie", 28);

        // Affichage des informations
        femme1.afficherInfos();
    }
}

