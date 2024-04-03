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
	    
	    public void details() {
	        System.out.println(toString());
	    }
	    
	    public void manger() {
	        System.out.println("L'humain mange.");
	    }

	    // Méthode pour boire
	    public void boire() {
	        System.out.println("L'humain boit.");
	    }
	    

		@Override
		public String toString() {
			return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	    
	    
}
