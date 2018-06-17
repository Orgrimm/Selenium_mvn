
public class return_String {

	public static void main (String [] args) {
		
		  String str = "Hello";
		  CharSequence s1 = "H";
		  CharSequence s2 = "l";
		  CharSequence s3 = "e";
		  CharSequence s4= "l";
		  
		  String replaceStr = str.replace (s1,s2);
		  String replaceStr1 = str.replace(s3,s4);
		  System.out.println(replaceStr);
		  System.out.println(replaceStr1);
		  

	}

}
