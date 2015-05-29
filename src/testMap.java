import java.util.HashMap;
import java.util.Map;


public class testMap {
	
	private static final double ALLOCATION_RATE = 0.6;
	private static final double PARTITION_EXPAND_FACTOR = 5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TOTALALLOCATIONNUM = (int) Math.ceil((1.0 - Math.log10((double) PARTITION_EXPAND_FACTOR ) /
			Math.log10((double)(1.0 -ALLOCATION_RATE))));
		
		System.out.println(TOTALALLOCATIONNUM);
	}

	
}
