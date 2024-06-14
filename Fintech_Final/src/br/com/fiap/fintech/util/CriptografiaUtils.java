package br.com.fiap.fintech.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CriptografiaUtils {

	public static String criptografar(String ds_senha) throws Exception {
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		md.update(ds_senha.getBytes("ISO-8859-1"));
		
		BigInteger hash = new BigInteger(1, md.digest());
		
		return hash.toString(16);
		
	}
}
