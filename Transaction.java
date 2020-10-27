public class Transaction {

    public static final String ACCEPTE = "Accepte";
    public static final String REFUSE = "Refuse";
    public static final String A_DETERMINER = "A determiner";

    public String noCompteSource;
    public String noCompteDestination;
    public double montant;
    public String statut;


    public Transaction(String noCompteSource, String noCompteDestination,
                       double montant, String statut){

        this.montant = montant;
        this.noCompteDestination = noCompteDestination;
        this.noCompteSource = noCompteSource;
        this.statut = statut;


    }

    Transaction(String noCompteSource, String noCompteDestination,
                double montant){

        this.montant = montant;
        this.noCompteDestination = noCompteDestination;
        this.noCompteSource = noCompteSource;

    }

    public String GetNoCompteSource (){

       return this.noCompteSource;

    }
    public String GetNoCompteDestination (){

       return this.noCompteDestination ;
    }
    public double GetMontant (){

       return this.montant;

    }
    public void setStatus (String status){

        this.statut = status;

    }
    public String GetStatus (){

        return this.statut;

    }




}
