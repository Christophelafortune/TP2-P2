public class TableTransaction{

    public String noCompteSoucre;
    public String noComteDestination;
    public double montants;
    public String status;

    public void ajouterUneTransaction(Transaction transaction){
      Transaction ajoutTransaction = new Transaction(transaction.noCompteSource,
              transaction.noCompteDestination,transaction.montant,
              transaction.statut);

    }
    public void obtenirTransactionPourCompte(Transaction transaction){

        transaction.GetNoCompteDestination();
        transaction.GetNoCompteSource();
        transaction.GetMontant();
        transaction.GetStatus();



    }
}
