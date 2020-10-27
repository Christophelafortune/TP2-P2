
/**
 * Ceci est la première partie. Cette partie nos sert à faire le segment
 * dorsal du programme.
 *
 * Nous allons recevoir par la suite la deuxième partie (frontal) du programme.
 *
 * Ce programme est fait pour le cours INF111 de l'Éts.
 *
 * @author Alexandre Ferland, Alexandre Lemyre, Christrophe lafortune
 * @version (copyright A2020)
 */
public class Main {

	/*Stratégie globale : on doit faire les test des deux méthodes qui se
	retrouve dans le module ListeFouilleBinaire. on doit être capable d'insérer
	des valeurs dans tableau et qu'on trie en ordre croissant. Aussi, qu'on doit
	obtenir la position de la valeur qu'on demande.
	 */

	public static void main(String[] args) throws Exception {

		Colonne colonne1 = new Colonne();

		colonne1.ajouterValeur("C.Lafortune");
		colonne1.ajouterValeur("A.Lemyre");
		colonne1.ajouterValeur("A.Ferland");

		colonne1.afficherContenu();

		System.out.println(colonne1.obtenirValeur(1));

		Comparable test = "O.Test";

		colonne1.remplacerValeur(test,1);

		colonne1.afficherContenu();

		colonne1.supprimer(1);

		colonne1.afficherContenu();

		System.out.println(colonne1.getNbElements());



	}
}