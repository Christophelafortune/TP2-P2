public class TableUtilisateur {

    public String nomUtilisateur;
    public byte [] hashMotDePasse;
    public byte [] salt;
    public String numerodeCompte;
    public double solde;


    public void ajouterUnUtilisateur(Utilisateur utilisateur){
        Utilisateur ajoutUtilisateur =
                new Utilisateur(utilisateur.nomUtilisateur,
                        utilisateur.hashMotDePasse,utilisateur.salt,
                        utilisateur.numeroDeCompte, utilisateur.solde);

    }
    public void obtenirUtilisateurParNom(Utilisateur utilisateur){


    }
    public void obtenirUtilisateurParCompte(Utilisateur utilisateur){

    }
}
