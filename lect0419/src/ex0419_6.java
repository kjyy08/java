

public class ex0419_6 {

	static void replaceStr(String instr) {
		String newStr1 = instr.replace("a", "S");
		System.out.println("replace string : " + newStr1 );
	}
	
	static void appendStr(String instr) {
		int ptr = instr.indexOf(",");
		String newStr2 = instr.substring(0,(ptr+1)) + " suwon ";
		System.out.println("append string : " + newStr2 );
	}
	
	static String deleteStr(String instr) {
		String newStr = instr.replace(",","");
		newStr = newStr.replace(".","");
		System.out.println("delete ,. string : " + newStr );
		return newStr;
	}
	
	static void lengthCount(String instr) {
		String[] tokens = instr.split(" ");
		for ( int i = 0; i < tokens.length; i++ ) {
			if ( tokens[i].length() >= 5 )
				System.out.println("greater than 5 string : " + tokens[i] );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr = "Four score and seven years ago our fathers brought forth on this continent," +
		"a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.";

		replaceStr(inStr);
		appendStr(inStr);
		String newStr = deleteStr(inStr);
		lengthCount(newStr);
	}
}
