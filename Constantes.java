import java.util.Scanner;

/**
 *
 * @author
 * @version (copyright A2020)
 */


public class Constantes {

    // Déclaration du tampon de clavier
    //*****************************************
    public static final Scanner clavier = new Scanner(System.in);
    //*****************************************

    //Constante permettant décaller de un
    final static public int DECALLER_DE_UN=1;
    //Constante pour retrécir le tableau
    final static public int RETRECIR_TABLEAU=4;
    //Constante permettant d' obtenir une nouvelle dimension de la file
    final static public int VALEUR_DEUX=2;
    //Constante indiquant la valeur null
    final static public int VALEUR_NULL=0;
    //Constante indiquant la première adresse de la file
    final static public int INDEX_NULL=0;
    //Constante indiquant le nombre d'élément maximal de la file
    final static public int MAX_ELEMENT=100;
    //Constante indiquant que la valeur courante est
    //plus grande que celle passée en paramètre
    final static public int PLUS_GRAND=1;
    //Constante indiquant que la valeur courante est
    //plus petite que celle passée en paramètre
    final static public int PLUS_PETIT=-1;
    //Constante indiquant que la valeur courante est
    //égale à celle passée en paramètre
    final static public int EGALITE=0;
    //Message d'exception lorsque la position est non valide
    final static public String EXCEPTION_POSITION_NON_VALIDE= "Position "
            + " de  mémoire non valide";

    /*********************
     * CONSTANTES  DU PROGRAMME PRINCIPAL
     *********************/

    //Caractères spéciaux d'affichage

    public static final String EFFACE_ECRAN = "\f";
    public static final String SAUTE_LIGNE = "\n";


    //messages à utiliser tout au long d'exécution de l'application



    public static final String MSG_DE_CHOIX="\n\n\n\n\n\n               "
            + "                            "
            + "                      "
            + "   EFFECTUER UN CHOIX ENTRE 1 ET 6 : ";

    public static final String MSG_SI_ERREUR_SAISIE="\n\n\n\n\n\n       "
            + "                                   "
            + "                 VEUILLEZ EFFECTUER UN CHOIX DANS "
            + "L'INTERVALLE  1 ET 6 : ";

    public static final String LIGNE_ENTETE =
            "\n****************************************"
                    + "****************************************"
                    + "***************";

    public static final String TITRE =
            "\n QUELQUES OPERATIONS SUR TABLEAU               *";

    public static final String AUREVOIR =
            "\n MERCI D'AVOIR UTILISE CETTE APPLICATION, AUREVOIR "
                    + "ET A LA PROCHAINE......              *";

    public static final String MSG_BIENVENU =
            "\n\n                           BIENVENUE DANS LA "
                    + "PAGE DU MENU GENERAL                    ";

    public static final String ELEMENT_INTROUVABLE ="\n ELEMENT INTROUVABLE DANS VOTRE LISTE    ";
    public static final String ELEMENT_A_RECHERCHER ="\n SAISIR L' ELEMENT A RECHERCHER   "
            + "ET RETROUVER SON INDEX  :   ";
    public static final String SAISIE_VALEUR ="\n SAISIE DE LA VALEUR NUMERO  %d  :   ";
    public static final String INDEX_RECHERCHE ="\n L'INDEX DE VOTRE ELEMENT EST  %d   ";
    public static final String AFFICHE_TITRE_TABLEAU =" TABLEAU = [" + INDEX_NULL+"...";
    public static final String FIN_TITRE_TABLEAU ="] \n \n \n";

    public static final String AFFICHE_TABLEAU ="\n VALEUR À L'INDEX N°  ";
    public static final String AFFICHE_LIAISON =" est  ";

    public static final String AJOUT_VALEUR_TABLEAU =
            "\n  (1)	AJOUT DANS UN TABLEAU   ";
    public static final String VALEUR_SUPPRIMER ="\n POSITION DE L'ELEMENT A SUPPRIMER   :  ";
    public static final String INSERTION_TABLEAU =
            "\n  (2)	INSERTION D'UNE VALEUR DANS UN TABLEAU    ";

    public static final String AFFICHAGE_TABLEAU =
            "\n  (3)	AFFICHAGE DES VALEURS D'UN TABLEAU    ";

    public static final String AFFICHAGE_SUPP =
            "\n  (4)	SUPPRIMER UNE VALEUR DU TABLEAU    ";
    public static final String MSG_RECHERCHER =
            "\n  (5)	RECHERCHER UN OBJET PAR SON INDEX    ";
    public static final String MSG_SORTIR =
            "\n  (6)	QUITTER    ";
    public static final String NOMBRE_VALEUR ="\n ENTRER LE NOMBRE"
            + " DE VALEUR QUE VOUS SOUHAITER STOCKER EN MEMOIRE :  ";

    public static final String MESSAGE_CREATION_OBJET ="\n VALEUR MAX QUE PEUT CONTENIR VOTRE TABLEAU : \n "
            + "\n TAPEZ 0 POUR CONCERVER LA DIMENSION PAR DEFAUT A  "+ MAX_ELEMENT + "   "
            + " ET UNE AUTRE VALEUR POUR LA MODIFIER    ";


    public static final String RESULTAT_AJOUT ="\n--- OPERATION EFFECTUEE AVEC SUCCES ---   ";
    public static final String RESULTAT_SUPPRESSION ="\n--- SUPPRESSION EFFECTUEE AVEC SUCCES --- ";
    public static final String MESS_VALEUR_A_INSERRER ="\n VALEUR A INSERRER  :   ";

    //Rubriques du menu général

    public static final byte CHOIX_UN = 1;
    public static final byte CHOIX_DEUX = 2;
    public static final byte CHOIX_TROIS =3;
    public static final byte CHOIX_SUPP = 4;
    public static final byte CHOIX_RECHERCHER =5;
    public static final byte CHOIX_QUITTER =6;




}
