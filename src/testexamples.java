import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class testexamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, HashMap> maptest = new HashMap<Integer, HashMap>();
		HashMap<Integer, Integer> maptest01 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> maptest02 = new HashMap<Integer, Integer>();
		
		maptest01.put(0, 10);
		maptest01.put(1, 11);
		maptest01.put(2, 12);
		
		maptest02.put(0, 20);
		maptest02.put(1, 21);
		maptest02.put(2, 22);
			
		//System.out.println(maptest01);
		//System.out.println(maptest02);
		
		maptest.put(0, maptest01);
		maptest.put(1, maptest02);
		
		//System.out.println(maptest);

		HashMap<Integer, Integer> load = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();

		load=maptest.get(0);
		
		//System.out.println(load);
		
		
		
		
		
		for(int i=1; i<maptest.size();i++){
			tmp = maptest.get(i);
			
			Iterator iter = tmp.entrySet().iterator();
			Iterator iter01 = load.entrySet().iterator();
		
			while(iter.hasNext() && iter01.hasNext() ){
				Map.Entry entry = (Entry) iter.next();
				Map.Entry entry01 = (Entry) iter01.next();
				int val= (Integer) entry.getValue();
				int val01= (Integer) entry01.getValue();
				
				int sum = val + val01;
				load.put(i, sum);
				//break;
				
			}
		}
		System.out.println(load);
		
	}

}
