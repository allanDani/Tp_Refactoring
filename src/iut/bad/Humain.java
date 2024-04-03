package iut.bad;

public class Humain {
	 private String nom;
	    private String prenom;
	    private int age;

	    // Constructeur par défaut (sans paramètres)
	    public Humain() {
	        // Initialisation par défaut
	        this.nom = "";
	        this.prenom = "";
	        this.age = 0;
	    }

	    // Constructeur avec paramètres
	    public Humain(String nom, String prenom, int age) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	    }
}
