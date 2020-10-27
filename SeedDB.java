/**
 * Crée une base de données bidon pour démmarrer l'application dans le 
 * cadre du tp2 Inf111.
 * 
 * @Author Fred Simard
 * @version Automne A2020
 */


public class SeedDB {

	
	public static void seed(BaseDonnees bd) {
		ajouterLesUtilisateurs(bd);
		ajouterLesTransactions(bd);
	}

	private static void ajouterLesUtilisateurs(BaseDonnees bd) {
		
		Object[][] utilisateurs = {
				{"Fred Simard","fred12", "00-150-002", new Double(1500.0)},
				{"o","o", "00-150-004", new Double(1500.0)},
				{"Lily Jacques","lil12", "00-150-001", new Double(1500.0)},
				{"Jimmy Parent","jim12", "00-150-002", new Double(1500.0)},
				{"Claudia Marcy","clau12", "00-150-005", new Double(1500.0)}};
			
		
		for(Object[] utilisateur : utilisateurs) {
			bd.ajouterUtilisateur(new Utilisateur((String)utilisateur[0], 
												  (String)utilisateur[1],
												  (String)utilisateur[2],
												  (Double)utilisateur[3]));
		}
		
	}
	
	private static  void ajouterLesTransactions(BaseDonnees bd) {

		Object[][] transactions = {
				{"00-150-001","00-150-002", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-003","00-150-002", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-005","00-150-002", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-001","00-150-004", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-003","00-150-004", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-005","00-150-004", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-003","00-150-001", new Double(150.0),Transaction.ACCEPTE},
				{"00-150-005","00-150-001", new Double(150.0),Transaction.ACCEPTE}
				};
		
		for(Object[] transaction : transactions) {
			bd.ajouterTransaction(new Transaction((String)transaction[0],
												  (String)transaction[1],
												  (double)transaction[2],
												  (String)transaction[3]));
		}
	}
}
