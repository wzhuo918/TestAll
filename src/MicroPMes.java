
public class MicroPMes {

	//用于记录各个micro分区的信息

		public int microparId;		//小分区的编号
		public long	microparValue;  //小分区的数据量
		public String reduceId; //小分区所在的reduce节点
		public String  nodeName;		//小分所在的node节点
		
		@Override
		public int hashCode() {
			return microparId;
		}
		@Override
		public boolean equals(Object obj) {
			MicroPMes other = (MicroPMes) obj;
			return microparId == other.microparId;
		}
		
		
		public void print(){
			System.out.println("This is microparId:"+ this.microparId);
		}
		@Override
		public String toString() {
			return microparId + ":" + microparValue + ":" + reduceId + ":" + nodeName;
		}
		
	
}
