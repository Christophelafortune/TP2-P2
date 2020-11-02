/**
 *Cette classe permet d'insérer la valeur en ordre croissant et la position
 * d'une valeur demandé dans le tableau.
 *
 * @author Alexandre Ferland, Alexandre Lemyre et Christrophe lafortune
 *
 * @version 20 octobre 2020
 */

public class ListeFouilleBinaire extends ListeStatique {

    /**
     * FONCTION qui permet insérer une valeur dans le tableau et le mettre en
     * ordre croissant.
     *
     * @param valeur la valeur qu'on veut insérer.
     */
    public void inserer(Comparable valeur){

        if (nbElement == 0){

            ajouterElement(valeur,0);

        }
        else{

            int i = 0;
            boolean ajouter = false;

            //tant que i est plus petit que le nombre d'élément et
            // que ajouter est vrai.
            while (i < nbElement && !ajouter) {

                //on compare la valeur et la liste si sont plus petit que 0
                if (valeur.compareTo(liste[i]) < VIDE) {

                    //On déplace et on ajoute.
                    deplacerDroite(i);
                    ajouterElement(valeur,i);

                    ajouter=true;

                }

                i++;

            }

            if (!ajouter){

                ajouterElement(valeur,nbElement);

            }
        }
    }

    /**
     *FONCTION qui nous permet d'obtenir la valeur dans notre tableau.
     *
     * @param valeur la valeur qu'on recherche
     * @return l'index ou sinon que l'élément est absent.
     */
    public int obtenirIndex(Comparable valeur){

        int debut= VIDE;
        int fin = nbElement;
        boolean trouver = false;
        int milieu = -1;

        while (debut <= fin && !trouver) {

            milieu = (debut + fin) / 2;

            //on compare la valeur et la liste si sont plus petit que 0
            if (valeur.compareTo(liste[milieu]) < VIDE) {

                fin = milieu - 1;

            }
            else if  (valeur.compareTo(liste[milieu]) > VIDE) {

                debut = milieu + 1;

            }
            else{

                trouver = true;

            }

        }

        return (!trouver) ? ListeStatique.ELEMENT_ABSENT : milieu;

    }
}
