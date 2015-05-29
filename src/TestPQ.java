import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


public class TestPQ {


	
	//记录各节点（以Task的形式）的Task名称信息
	public static PriorityQueue<MicroPMes> AllMicrPMess = new PriorityQueue<MicroPMes>(1000, 
		new Comparator<MicroPMes>() {
			@Override
			public int compare(MicroPMes o1, MicroPMes o2) {
				return (int) (o2.microparValue - o1.microparValue);
			}
		
	});
	public static HashMap<Integer, MicroPMes> IDToMPM = new HashMap<Integer, MicroPMes>();
	
	
 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] localSampleMess = new String[3];
		localSampleMess[0]="0=41,1=2,2=3";
		localSampleMess[1]="0=11,1=12,2=13";
		localSampleMess[2]="0=21,1=22,2=23";
		
		for(int j=0; j<localSampleMess.length;j++){
			long total = 0;
			if (localSampleMess[j].length() > 1) {
				String[] mes = localSampleMess[j].split(",");
				if (mes.length > 0) {
					for (int i = 0; i < mes.length; i++) {
						
						String[] finallocalTable = mes[i].split("=");
						int localMicroParId = Integer.valueOf(finallocalTable[0]);
						Long localMicroParNum = Long.valueOf(finallocalTable[1]);
						MicroPMes mpm = new MicroPMes();
						//将采样的结果记录到放分区的链表中
						mpm.microparId = localMicroParId;
						mpm.microparValue = localMicroParNum;
						
						//初始化未分配分区的链表
						//System.out.println(AllMicrPMess.contains(mpm));
						if(AllMicrPMess.contains(mpm)){
							//System.out.println("mpmID:"+mpm.microparValue + "mpmva:" + mpm.microparValue);
							
							total= IDToMPM.get(localMicroParId).microparValue + localMicroParNum;
							AllMicrPMess.remove(mpm);
							MicroPMes mpm1 = new MicroPMes();
							mpm1.microparId = localMicroParId;
							mpm1.microparValue = total;
							AllMicrPMess.add(mpm1);
							IDToMPM.put(mpm1.microparId, mpm1);
							//System.out.println("AllMicrPMess:"+AllMicrPMess);

						}else{
							AllMicrPMess.add(mpm);
							IDToMPM.put(mpm.microparId, mpm);
							//System.out.println("AllMicrPMess:"+AllMicrPMess);
						}
					}
					
				}
			}
			//System.out.println("AllMicrPMess=" + AllMicrPMess);
		}
		for(int i=0; i<IDToMPM.size(); i++){
			System.out.println("IDToMPM=" + IDToMPM.get(i));
		}
		IDToMPM.clear();
		
		System.out.println("IDToMPM=" + IDToMPM);
		//System.out.println(AllMicrPMess.poll());
		//System.out.println(AllMicrPMess.poll());
		//System.out.println(AllMicrPMess.poll());
		
	}

}
