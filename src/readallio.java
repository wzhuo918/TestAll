/**
 * 顺序读入一个目录下的所有文件，并将文件输出到另一个文件的夹下的文件中
 * 
 */

import java.io.*;

public class readallio {

	public static void main(String args[]) {
		FileInputStream in;
		DataInputStream dis = null;

		FileOutputStream fo;

		String[] filein = new String[20];
		String[] fileout = new String[20];

		File dirin = new File("/home/wzhuo/example/cosmology/test");
		File[] filesin = dirin.listFiles();
		
		File dirout = new File("/home/wzhuo/example/cosmology/testout");
		File[] filesout = dirout.listFiles();

		for (int i = 0; i < filesin.length; i++) {
			// System.out.println(dir + "/"+files[i].getName());
			filein[i] = dirin + "/" + filesin[i].getName();
			System.out.println(filein[i]);
			
			fileout[i] = dirout + "/" + filesout[i].getName();
			System.out.println(fileout[i]);
		}


		try {			
			
			for (int j = 0; j < filesin.length; j++) {
				
				in = new FileInputStream(filein[j]);
				fo = new FileOutputStream(fileout[j]);

				dis = new DataInputStream(in);

	            Float temp = (float) 0;
	            String outs = "";
				while (dis.available() != 0) {
	            	temp = dis.readFloat();
	                System.out.println(temp);
	                //fo.write((Float)dis.readFloat());
	                outs = temp.toString();
	                fo.write(outs.getBytes()); 
	                fo.write('\n');
				}
				dis.close();
				fo.close();
			}		
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}