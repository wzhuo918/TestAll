import java.util.StringTokenizer;


public class testspilt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "10000590		1	10001756 10001757 10001762 10001760 10001755 10001758 10001761 10001759 ";
		StringTokenizer a = new StringTokenizer(a1);
		
		//String[] b = a1.split("\t");

		if(a.hasMoreElements()){
			System.out.println(a.countTokens());
			String b = a.nextToken();
			System.out.println(b);
			System.out.println(a.countTokens());
			System.out.println(a.nextToken());
		}
		
		String st = " ";
		
		
//		while (a.hasMoreTokens()){
//			System.out.println(a.nextToken());
//		}
		
	}

}
