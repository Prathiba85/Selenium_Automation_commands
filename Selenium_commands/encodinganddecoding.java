package Selenium_commands;

import org.apache.commons.codec.binary.Base64;

public class encodinganddecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "test123";
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("new String :"+new String (encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("decoded String :"+new String (decodedString)); 

	}

}
