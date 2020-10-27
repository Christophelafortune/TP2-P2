public class ColonneIndexee extends Colonne {

    ListeFouilleBinaire liste;

    public ColonneIndexee (){
        super();
        liste = new ListeFouilleBinaire();
    }

    //TODO
    public class indexation{
        int index;
        Object valeur;
    }



    @Override
    public void ajouterValeur(Object valeur) throws Exception {

        this.liste.inserer(valeur,getNbElements());
        super.liste.inserer(valeur,getNbElements());

    }

    public Object obtenirIndex(int index) throws Exception {

        return this.liste.obtenirIndex(index);

    }

    public void remplacerValeur(Object valeur, int index) throws Exception {
        throw new Exception("Methode non supportée");
    }

    public void supprimer(int index) throws Exception {
        this.liste.supprimerElement(index);
        super.liste.supprimerElement(index);
    }

    public void afficherContenu(){

        liste.afficherList();

    }

    public boolean estUnique(Object valeur){

        return false;
    }

}
