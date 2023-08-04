package com.soluceapp.shared;

	import java.math.BigInteger;
	import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;

public class Shared_crypt  {

		public String encryptString(String input) throws NoSuchAlgorithmException {
			
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger bigInt = BigInteger (1,messageDigest);
			return bigInt.toString(16);
			
		}

		private BigInteger BigInteger(int i, byte[] messageDigest) {
			// TODO Auto-generated method stub
			return null;
		}

	
		
		
		
	}
