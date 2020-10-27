public class Utilisateur {

    //Donnée membre
    public String nomUtilisateur;
    public String numeroDeCompte;
    public double solde;
    public byte[] salt;
    public byte[] hashMotDePasse;


    //Constructuer
    public Utilisateur(String nomUtilisateur, String motDePasse,
                       String numeroDeCompte, double solde){

        this.nomUtilisateur = nomUtilisateur;
        this.numeroDeCompte = numeroDeCompte;
        this.solde = solde;


    }

    public Utilisateur(String nomUtilisateur, byte[] hashMotDePasse,
                       byte[] salt, String numeroDeCompte, double solde){

        this.nomUtilisateur = nomUtilisateur;
        this.numeroDeCompte = numeroDeCompte;
        this.solde = solde;
        this.hashMotDePasse = hashMotDePasse;
        this.salt = salt;
    }

    //Getter
    public String getNomUtilisateur(){

        return this.nomUtilisateur;
    }

    public String getNumeroDeCompte(){

        return this.numeroDeCompte;
    }

    public double getSolde(){

        return this.solde;
    }

    public byte[] salt(){

        return this.salt;
    }

    public byte[] getHashMotDePasse(){

        return this.hashMotDePasse;
    }

    //Méthode
    public boolean authentifier(String nomUtilisateur, String motDePasse){

        return validerNomUtilisateur(nomUtilisateur) &&
                validerMotDePasse(motDePasse);

    }

    private boolean validerMotDePasse(String motDePasse) {

        return  false;

    }

    private boolean validerNomUtilisateur(String nomUtilisateur ) {

        return  this.nomUtilisateur == nomUtilisateur;
    }


    public void transactionSurSolde(double differentiel){

    }

    public String toString(){

        return nomUtilisateur;
    }

}
