import java.lang.reflect.Array;
import java.util.Arrays;

public class BaseDonnees {

    TableTransaction tableTransaction;
    TableUtilisateur tableUtilisateur;

    public void getInstance(){

    }

    public void viderLaBd(){

        tableTransaction = null;
        tableUtilisateur = null;
    }
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        tableUtilisateur.ajouterUnUtilisateur(utilisateur);
    }
    public void obtenirUtilisateurParNom(Utilisateur utilisateur){
        tableUtilisateur.obtenirUtilisateurParNom(utilisateur);
    }
    public void obtenirUtilisateurParCompte(Utilisateur utilisateur){
        tableUtilisateur.obtenirUtilisateurParCompte(utilisateur);
    }
    public void ajouterTransaction(Transaction transaction){
        tableTransaction.ajouterUneTransaction(transaction);
    }
    public void obtenirTransactionPourCompte(Transaction transaction){
        tableTransaction.obtenirTransactionPourCompte(transaction);
    }
    public void mettreAJourSoldeUtilisateur(){

    }


}
