
public class testexamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "12.32";
		
		String[] b = a.split("\\.");
		
		int res = Integer.valueOf(b[0]);
		
		System.out.println(res);

	}

}
