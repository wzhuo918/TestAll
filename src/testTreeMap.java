import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;



public class testTreeMap {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		tmap.put(1, 10);
		tmap.put(3, 30);
		tmap.put(2, 20);
		tmap.put(4, 40);
		tmap.put(5, 50);
		
		
		//这里将map.entrySet()转换成list
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(tmap.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue() > 0 ? 1 : -1;
			}
            
        });
        
        Map.Entry testone = list.get(0);
        int a = (Integer) testone.getKey();
        int b = (Integer) testone.getValue();
        
        System.out.println(a);
        System.out.println(b);
 
        
		
		
//		Map<Integer, LinkedList<Integer>> tmap1 = new HashMap<Integer, LinkedList<Integer>>();
//		LinkedList<Integer> tl1 = new LinkedList<Integer>();
//		LinkedList<Integer> tl2 = new LinkedList<Integer>();
//		tl1.add(1);
//		tl2.add(2);
//		tl2.add(3);
//		tmap1.put(10,tl1);
//		tmap1.put(20,tl2);
//		//tl1.addAll(tl2);
		
//		Map<Integer, String> tmap3 = new HashMap<Integer, String>();
//		tmap3.put(0, "true");
//		tmap3.put(1,"false");
//		
//		if(tmap3.containsValue("true")){
//			System.out.println("tmap3="+tmap3);
//		}
		
//		boolean a = false;
//		System.out.println("boolean="+String.valueOf(a));
//		System.out.println("tl2="+tl2);
//		System.out.println("tl2.size()="+tl2.size());
//		for(int i=0; i<tl1.size();i++){
//			tl2.removeFirst();
//			System.out.println("tl2="+tl2);
//		}
//		System.out.println("tl2.size()="+tl2.size());
		//tmap1.put(30, tl2);
		//tmap1.remove(10);
		

		//boolean finished = (tmap1.size() == 0);

		
		//int num = tmap.size()/2;
//		Iterator ititer = (Iterator) tmap1.entrySet().iterator();  
//        while (ititer.hasNext()) {  
//            //it.next()得到的是key，tm.get(key)得到obj
//        	Map.Entry ent = (Map.Entry)ititer.next();
//        	LinkedList<Integer> ls= (LinkedList<Integer>) ent.getValue();
//        	if(ls.contains(2)){
//        		System.out.println(ls);
//        	}
//        	  
//        }  
		//System.out.println("tmap1="+tmap1);
		//System.out.println(finished);
	}

}
