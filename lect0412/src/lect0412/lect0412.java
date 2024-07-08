package lect0412;

public class lect0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  Simpson, who was acquitted of murdering his ex-wife "
				+ "and her friend in a televised trial "
				+ "that became a cultural phenomenon, "
				+ "has died of cancer, his family announced.    ";
		System.out.println("length : " + str.length());
		String str1 = new String();
		System.out.println("isEmpty : " + str1.isEmpty());
		System.out.println("5-th char : " + str.charAt(4));
		System.out.println("5 - 10th chars : " + str.substring(4,(4+6)));
		for ( int i = 0; i < 5; i++ )
			System.out.println("30th chars : " + str.substring((i*30)));
		
		String newStr1 = str.substring(10,16);
		String newStr2 = str.substring(16,21);
		System.out.println("concate : " + newStr1.concat(newStr2) + 
				"  => + " + newStr1 + newStr2);
		System.out.println("index of who char : " + str.indexOf("who"));
		System.out.println("that leading string : " + str.substring(str.indexOf("that")));
	
		String ns1 = "suwon";
		if ( ns1.equals("Suwon") ) {
			System.out.println("Same string");
		}
		else {
			System.out.println("Different string");
		}
		
		int result = ns1.compareTo("suwon univ");
		if ( result == 0 ) {
			System.out.println("Same string" );
		}
		else if ( result > 0 ) {
			System.out.println("longer string" );
		}
		else {
			System.out.println("less string" );
		}
		System.out.println("toLower " + str.toLowerCase() );
		System.out.println("toUpper " + str.toUpperCase() );
		
		System.out.println("trim : " + str.trim() );
		System.out.println("replace : " + str.replace("his","suwon") );
		
		String newStr3 = str.replace(",","");
		String[] token = newStr3.trim().split(" ");
		for ( int i = 0; i < token.length; i++ ) {
			System.out.println("token : " + token[i] );
		}
	}

}
