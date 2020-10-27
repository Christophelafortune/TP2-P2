public class Colonne implements InterfaceColonne {

    ListeStatique liste;


    public Colonne(){

        liste = new ListeStatique();

    }

    public void ajouterValeur(Object valeur) throws Exception {

        liste.inserer(valeur,getNbElements());

    }


    public Object obtenirValeur(int index) throws Exception {

        return liste.getElement(index);

    }

    public int obtenirIndex(Object valeur){

        return liste.obtenirIndex(valeur);

    }

    public void remplacerValeur(Object valeur, int index) throws Exception {
        liste.remplacer(valeur,index);
    }


    public void supprimer(int index) throws Exception {
        liste.supprimerElement(index);
    }

    public int getNbElements(){

        return liste.nbElement;
    }

    public void afficherContenu(){

        liste.afficherList();

    }




}
