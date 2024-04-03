package iut.bad;

public class Femme extends Humain{
	 public Femme() {
	        super();
	    }
	 
	 public static void main(String[] args) {
	        Femme femme = new Femme();
	        Homme homme = new Homme();

	        femme.ami(homme); // Déclare que la femme est amie avec l'homme
	    }
}

