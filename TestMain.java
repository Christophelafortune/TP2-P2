import java.io.IOException;
/**
 * Ceci est la première partie. Cette partie nos sert à faire le segment
 * dorsal du programme.
 *
 * Nous allons recevoir par la suite la deuxième partie (frontal) du programme.
 *
 * Ce programme est fait pour le cours INF111 de l'Éts.
 *
 * @author Alexandre Ferland, Alexandre Lemyre, Christrophe lafortune
 * et Albert le Grand Chuenteu Tchouli,
 * @version (copyright A2020)
 */
public class TestMain {

	/*Stratégie globale : on doit faire les test des deux méthodes qui se
	retrouve dans le module ListeFouilleBinaire. on doit être capable d'insérer
	des valeurs dans tableau et qu'on trie en ordre croissant. Aussi, qu'on doit
	obtenir la position de la valeur qu'on demande.
	 */

	public static void main(String[] args) throws Exception {

		//Création du tableau binaire.
		ListeFouilleBinaire tableauBinaire = new ListeFouilleBinaire();
		ListeStatique tab = new ListeStatique(5);

		tab.inserer(1,0);
		tab.inserer(4,1);
		System.out.println(tab.obtenirIndex(1));

		//On insére les valeur dans le tableau.
		tableauBinaire.inserer(9);
		tableauBinaire.inserer(5);
		tableauBinaire.inserer(6);
		tableauBinaire.inserer(3);

		//on affiche la postion de la valeur demandé.
		System.out.println(tableauBinaire.obtenirIndex(2));
		System.out.println(tableauBinaire.obtenirIndex(5));


	}
}