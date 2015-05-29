import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import sun.text.CompactByteArray;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class Linklist_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		
		LinkedList<Integer> maxllist = new LinkedList<Integer>();
		maxllist.add(5);
		maxllist.add(2);
		maxllist.add(1);
		maxllist.add(4);
		maxllist.add(3);
		
		//Collections.sort(maxllist);
		//System.out.println(maxllist);
		
		//按照降序输出
		Collections.sort(maxllist, new Comparator<Integer>(){  
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2 > 0 ? -1 : 1; 
			}  
        }); 
		
        //System.out.println(maxllist);
        
		for(int i=0; i < maxllist.size();i++){
			if(list.contains(maxllist.get(i)) == false){
				maxllist.remove(i);
				i--;
				//System.out.println(maxllist);
			}
		}
		//System.out.println(maxllist);

		Map<Integer, Integer> treemap = new TreeMap<Integer,Integer>();
		

		treemap.put(1, 12);
		treemap.put(2, 13);
		treemap.put(3, 10);
		System.out.println(treemap);
		
		
		ArrayList<Map.Entry<Integer, Integer>> liste = new ArrayList<Map.Entry<Integer, Integer>>(treemap.entrySet());  

		
		
	 	Collections.sort(liste, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue() > 0 ? -1 : 1;
			}
		});
	 		
	 	System.out.println(liste);
	 	
        Map newMap = new LinkedHashMap();  
        for (int i = 0; i < liste.size(); i++) {  
            newMap.put(liste.get(i).getKey(), liste.get(i).getValue());  
        } 

		System.out.println(newMap);
	}

}
