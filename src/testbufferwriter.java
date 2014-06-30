import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testbufferwriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 0;
		try {

			FileWriter fw = new FileWriter(
					"/home/wzhuo/hadoop/hadoop-1.1.2/test01.txt", true);
			//BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter bw=new PrintWriter(fw); 
			
			System.out.println(index);		
			bw.println(index);

			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
