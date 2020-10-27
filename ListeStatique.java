/**
 *Cette classe contient plusieurs sous-programme pour créer
 * un tableau statiqueet nous permet d'insérer, supprimer ou remplacer
 * un élément dans le tableau.
 *
 * @author Alexandre Ferland, Alexandre Lemyre, Christrophe lafortune
 * et Albert le Grand Chuenteu Tchouli,
 * @version 20 octobre 2020
 */
public class ListeStatique {

    //Donnée membre
    public Object[] liste;
    protected int nbElement;

    /* CONSTANTES */

    //Constante
    protected static final int NB_ELEMENT_DEFAULT = 10;
    protected static final int VIDE = 0;

    //Constante utilisé pour les messages d'erreurs
    protected static final String POS_NON_VALIDE = "Position non-valide";
    protected static final String ERR_LISTE_VIDE = "La liste est vide";
    protected static final int ELEMENT_ABSENT = -1;

    //Constructeur par défaut
    public ListeStatique(){

        liste = new Object[NB_ELEMENT_DEFAULT];
        this.nbElement = VIDE;

    }

    //Constructeur avec un nombre d'élément défini
    public ListeStatique(int nbElement){

        liste = new Object[nbElement];
        this.nbElement = VIDE;

    }
    /* FONCTION UTILITAIRES */

    /**
     * FONCTION pour ajouter un élément à une position défini dans le tableau.
     *
     * @param element l'élément qu'on va mettre dans le tableau.
     * @param position la postion qui retrouve dans le tableau.
     * @throws Exception
     */
    public void inserer(Object element, int position) throws Exception{

        /*
        Stratégie: On fait trois situation pour insérer une valeur: soit que la
        liste est vide, soit qu'elle est pleine,ou elle a des valeurs sans être
         pleine. On envoie des messages d'exception si l'utilisateur entre une
         donnée dans une position non valide. Si la liste est pleine, on ajoute
         une méthode pour agrandir la liste. On utilise une méthode pour
         déplacer les valeurs a droite et insérer la valeur demandée
         à la position demandée.
         */

        //Vérifie si la liste est vide
        if((nbElement == VIDE && position != VIDE) || position > nbElement){

            throw new Exception(POS_NON_VALIDE);

        }
        else if(nbElement == liste.length){

            agrandirListe();
            deplacerDroite(position);
            ajouterElement(element, position);

        }
        //Déplace les données à droite et ajouter l'élement
        else{

            deplacerDroite(position);
            ajouterElement(element, position);

        }
    }

    /**
     * FONCTION qui ajoute un element au dernier indice.
     *
     * @param element l'élément qu'on va mettre dans le tableau.
     */
    public void insererApresDernier(Object element){
        /*
        Stratégie: Nous pouvons accéder à la prochaine position vide dans la
        liste à l'aide du nombre d'élélement significatif où l'élément sera
        placé. Nous incrémentons le nombre d'élément significatif ensuite.
         */

        liste[nbElement] = element;
        nbElement++;

    }

    /**
     * FONCTION qui déplace les éléments d'un indice vers la droite.
     *
     * @param position la postion qui se retrouve dans le tableau.
     */
    protected void deplacerDroite(int position){

        /*
        Stratégie: Nous itérons à partir de la fin du tableau
         (-2 position pour ne pas jouer avec des cases vides)
        jusqu'à la position voulu. À chaque itération,
         nous changeons la valeur de la prochaine case pour ne pas perdre
        nos valeurs.
         */

        for (int i = liste.length - 2; i >= position ; i--) {

            liste[i+1] = liste[i];

        }

    }

    /**
     * FONCTION qui agrandie la liste dans le cas ou elle est pleine et
     * il faut ajouter une nouvelle valeur.
     */
    protected void agrandirListe() {

        /*
        Stratégie: Nous créons un tableau temporaire qui mesure le double du
         tableau original et copie les données du tableau original dedans.
         Ensuite, nous changeons la réference du tableau original par la suite.
         */

        Object[] temp = new Object[liste.length * 2];
        System.arraycopy(liste,0,temp,0,liste.length);
        liste = temp;

    }

    /**
     * FONCTION qui ajoute un élément dans la liste.
     *
     * @param element l'élément qu'on va mettre dans le tableau.
     * @param position la postion qui se retrouve dans le tableau.
     */
    protected void ajouterElement (Object element, int position){

        /*
        Stratégie: Ajoute l'élement à la position reçu en paramètre.
        Nous augmentons ensuite notre nombre d'élément significatif.
         */

        liste[position] = element;
        nbElement++;

    }

    /**
     * FONCTION qui supprime l'element à la position recu en paramètre.
     *
     * @param position la postion qui se retrouve dans le tableau.
     * @throws Exception
     */
    public void supprimerElement(int position) throws Exception{

        /*
        Stratégie: Nous vérifions que la liste est vide et que la position
        recu en paramètre fait parti de la liste. Sinon nous envoyons
        un message        d'erreur. Nous effaçons l'élément a l'aide de
        deux méthodes: effacerElement et deplacerGauche.
         */

        //Vérifie si la liste est vide
        if (nbElement == 0){

            throw new Exception(ERR_LISTE_VIDE);

        }

        //Vérifie si la position recu est plus grande que la longueur de
        // la liste.

        else if(position >= liste.length){

            throw new Exception(POS_NON_VALIDE);

        }

        //Sinon, on efface l'élément et déplace les données vers la gauche.

        else{

            effacerElement(position);
            deplacerGauche(position);

        }

        //Si le nombre d'élément est plus petit que la moitié de la longeur du
        //tableau, on réduit la liste.

        if (nbElement < liste.length / 2){

            reduireListe();

        }

    }

    /**
     * FONCTION qui déplace tous les élements vers la gauche à partir
     * de la position reçu en paramètre.
     *
     * @param position la postion qui se retrouve dans le tableau.
     */
    protected void deplacerGauche(int position) {

        /*
        Stratégie: Nous itérons à partir de la position demandée jusqu'à la fin
        de la liste. Pour chaque position, nous copions la valeur
        de la prochaine position.
         */

        for (int i = position; i < liste.length - 2 ; i++) {

            liste[i] = liste[i + 1];

        }

    }

    /**
     * FONCTION qui efface l'élément à l'indice recu en paramètre et réduit
     * le nombre d'élément significatif ensuite.
     *
     * @param position la postion qui se retrouve dans le tableau.
     */
    protected void effacerElement(int position) {

        liste[position] = null;
        nbElement--;

    }

    /**
     * FONCTION qui réduit la taille du tableau.
     */
    protected void reduireListe(){

        /*
        Stratégie:Nous créons une liste temporaire appelé temp. Elle est assigné
        avec le 3/4 de la liste principale. Ensuite, Nous itérons à partir du
        début jusqu'à la fin et donnons toutes les valeurs de la liste
        principale à la liste temporaire. Ensuite, nous assignons la liste
        principale au tableau temporaire pour garder la grandeur désirée.
         */

        Object [] temp = new Object[liste.length - (liste.length / 4)];

        for (int i = 0; i < temp.length - 1 ; i++) {
            temp[i] = liste[i];
        }

        liste = temp;

    }

    /**
     * Retourne l'indice de l'object recu en parametre et
     * renvoie un exception si la valeur n'existe pas
     *
     * @param valeur la valeur qu'on recherche.
     * @return la position ou que l'élément est absent.

     */
    public int obtenirIndex(Object valeur) {

        /*
        Stratégie: Nous itérons du début à la fin de la liste en utilisant
        une fonction equals pour identifié la valeur recherché à une valeur
        dans notre liste. Si aucune valeur n'a été trouvée,
        un message d'erreur est envoyé.
         */

        int index = ELEMENT_ABSENT;

        for (int i = 0; i < liste.length - 1; i++) {

            if (valeur.equals(liste[i])) {

                index = i;

            }
        }

        return index;

    }

    /**
     * Retourne l'élément à l'index reçu.
     *
     * Antécédent : La liste ne doit pas être vide.
     *
     * Conséquent : Aucun
     *
     * @return L'élément à l'index reçu.
     */
    public Object getElement(int index) throws Exception{

        /*Stratégie : Retourne simplement l'élément à la
         * position de index après l'avoir validé.
         */
        validerIndex(index);

        return liste[index];
    }

    /*
     * Fonction privée qui valide que l'index est dans la bonne plage.
     *
     * Une exception est levée dans le cas contraire.
     */
    private void validerIndex(int index) throws Exception {

        if (index < 0 || index > nbElement) {

            throw new Exception("L'index n'est pas valide" +
                    index + " " +
                    nbElement);
        }

    }


    /**
     *FONCTION qui remplace la valeur de la position reçu en paramètre.
     *
     * @param valeur la valeur qu'on recherche.
     * @param position la postion qui se retrouve dans le tableau.
     * @throws Exception position non valide
     */
    public void remplacer(Object valeur, int position) throws Exception{

        /*
        Stratégie: Si la positon demandée ne fait pas partie de notre liste,
        nous envoyons un message d'erreur. Sinon la valeur est remplacée.
         */

        if (position >= liste.length){

            throw  new Exception(POS_NON_VALIDE);

        }
        else{

            liste[position] = valeur;

        }
    }

    /**
     * FONCTION qui affiche la liste
     */
    public void afficherList(){

        /*
        Stratégie: Nous itérons la liste du début à la fin.
        À chaque itérations, nous imprimons la valeur.
         */

        for (int i = 0; i < liste.length ; i++) {

            System.out.print(liste[i] + ", ");

        }

        System.out.println();

    }
}