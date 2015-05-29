import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class testlistremove {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> maxllist = new TreeMap<Integer, Integer>();
		maxllist.put(0, 10);
		maxllist.put(1, 9);
		maxllist.put(2, 11);
		maxllist.put(3, 7);
		
		//对max负载节点的所有分区按照降序排序，并取出最大分区的id和数据量
		ArrayList<Map.Entry<Integer, Integer>> maxloadlist = new ArrayList<Map.Entry<Integer, Integer>>(
			(Collection<? extends Entry<Integer, Integer>>) maxllist.entrySet());
		Collections.sort(maxloadlist, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue() > 0 ? 1 : -1;
			}
		});
		
		System.out.println(maxloadlist);
		
		for(int i=0; i<maxloadlist.size();i++){
			Map.Entry maxloadmaxp = maxloadlist.get(i);
			System.out.println("3333");
			int maxloadPId = (Integer) maxloadmaxp.getKey();
			System.out.println("2222");
			int maxloadPValue = (Integer) maxloadmaxp.getValue();
			System.out.println("1111");
			
			System.out.println(maxloadPId);
		}
		
		
//		
//		Iterator eachplaniter = UnAssiMicP.entrySet().iterator();
//		while(eachplaniter.hasNext()){
//			eachplaniter.next();
//			System.out.println(UnAssiMicP);
//		}
	}

}
