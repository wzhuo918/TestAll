import java.io.*;

public class testreadio {

    public static void main(String args[]) {
        FileInputStream in;
        DataInputStream dis;
        
        FileOutputStream fo;
        
        try {
            in = new FileInputStream("/home/wzhuo/example/cosmology/data/z8.0");
            dis = new DataInputStream(in);
            fo = new FileOutputStream("/home/wzhuo/example/cosmology/data/z800.txt");
            Double temp = (Double) 0.0;
            String outs = "";
        
            while (dis.available() != 0) {
            	temp = dis.readDouble();
            	
                System.out.println(temp.intValue());
                //fo.write((Float)dis.readFloat());
                outs = temp.toString();
                fo.write(outs.getBytes()); 
                fo.write('\n');
            }
            dis.close();
            fo.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       
    }
}