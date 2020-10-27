/**
 * Dans le cadre du cours inf111, ce code est fourni aux étudiants.
 * Nous en donnons la provenance mais pas les explications.  C'est hors
 * du plan de cours.
 * 
 *  @author  Fred Simard
 *  @vversion A2020
 */

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class UtilitairesDB {

	private static final int LONGUEUR_SALT = 16;
	
	protected static SecureRandom random = new SecureRandom();

	// ref: https://www.baeldung.com/java-password-hashing
	public static byte[] obtenirSalt() {
		
		byte[] salt = new byte[LONGUEUR_SALT];
		
		random.nextBytes(salt);
		
		return salt;
	}

	public static byte[] hashMotDePasse(String motDePasse, byte[] salt) {
		
		KeySpec spec = new PBEKeySpec(motDePasse.toCharArray(), salt, 65536, 128);
		
		SecretKeyFactory factory;
		
		try {
			
			factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			return factory.generateSecret(spec).getEncoded();
			
		} catch (NoSuchAlgorithmException e) {
			
			return null;
			
		}catch (InvalidKeySpecException e) {
			
			return null;
		}
	}

}
