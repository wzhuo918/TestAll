import java.util.LinkedList;


public class testDeletlinkedlist {

	public static LinkedList<Integer> AssignedMicroPartitions = new LinkedList<Integer>();
	public static LinkedList<Integer> UnAssignedMicroPartitions = new LinkedList<Integer>();
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int micronumid = 0;
		
		//初始化未分配的分区
		while(UnAssignedMicroPartitions.size() != 10 ){
			UnAssignedMicroPartitions.add(micronumid);
			micronumid++;
		}
		
		System.out.println(UnAssignedMicroPartitions);
		
		int ReduceNum = 5;
		
		for (int i = 0; i < ReduceNum; i++) {
			AssignedMicroPartitions.add(i);
			UnAssignedMicroPartitions.removeFirst();
		}
		System.out.println(AssignedMicroPartitions);
		System.out.println(UnAssignedMicroPartitions);
	}

}
