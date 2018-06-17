
public class Testings {
	public static void main(String[] args) {

		String[]a=new String[] {"Downtown","Uptown","brooklyn"};
		String []b=new String[] {"Day","Night"};
		
		for(int i=0,j=0; i<a.length && j<b.length;i++,j++) {
			System.out.println(a[i]+""+b[j]+"-");
		}
	}

}
