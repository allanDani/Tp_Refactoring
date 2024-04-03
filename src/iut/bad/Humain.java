package iut.bad;

import java.util.List;

public class Humain implements Consommation{
	 private String nom;
	    private String prenom;
	    private int age;
	    private List<Humain> amis;

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
	    
	    public void ami(Humain ami, int dureeAmitiee) {
	        amis.add(ami);
	        System.out.println(this.prenom + " est maintenant ami avec " + ami.getPrenom() + ".");
	    }
	    
	    public void ami(Humain ami) {
	        ami(ami, 100); // Appel à la méthode ami() avec la durée d'amitié par défaut de 100 jours
	    }
	    
	    public void details() {
	        System.out.println(toString());
	    }
	    
	    @Override
	    public void manger() {
	        System.out.println("L'humain mange.");
	    }

	    // Méthode pour boire
	    @Override
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

		public List<Humain> getAmis() {
			return amis;
		}

		public void setAmis(List<Humain> amis) {
			this.amis = amis;
		}

		
	    
}
