package borshe;

public class StringToIntConvert {
	
	public static int StringToInt(String a) {
		
		String b = "";

		for (int i = 0; i < a.length(); i++) {
			char c7 = a.charAt(i);
			if (a.charAt(i) == '.')
				break;
			if (Character.isDigit(c7)) {
				b += c7;
			}
		}

		int t = Integer.parseInt(b);
		return t;
	}}