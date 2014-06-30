import java.util.Random;

/**
 * 
 * 生成满足zipf概率分布的例子
 * 
 * @author wzhuo
 * 
 */
public class ZipfGenerator {
	//private static Random rnd = new Random(System.currentTimeMillis());
	private static Random rnd = new Random(10);
	private static int size = 5; // 产生数据 值的范围
	private static double skew = 0.6;
	private static int datasize = 15;

	private static double bottom = 0;
	private static int eachdata;

	public ZipfGenerator(int size, double skew) {
		this.size = size;
		this.skew = skew;

		// 求出底数之和
		for (int i = 1; i < size; i++) {
			this.bottom += (1 / Math.pow(i, this.skew));
		}
		//System.out.println("bottom = " + bottom);		
		
	}
	
//	public void setSeed(long seed){
//		rnd = new Random(seed);
//	}

	// the next() method returns an random rank id.
	// The frequency of returned rank ids are follows Zipf distribution.
	public static int next() {
		int rank;
		double friquency = 0;
		double dice;

		rank = rnd.nextInt(size);
		friquency = (1.0d / Math.pow(rank, skew)) / bottom;
		dice = rnd.nextDouble();

		while (!(dice < friquency)) {
			rank = rnd.nextInt(size);
			friquency = (1.0d / Math.pow(rank, skew)) / bottom;
			dice = rnd.nextDouble();
			System.out.println("rank= " + rank);
		}
		return rank;
	}

	// 求出某一数据出现的概率
	// This method returns a probability that the given rank occurs.
	public double getProbability(int rank) {
		return (1.0d / Math.pow(rank, this.skew)) / this.bottom;
	}

	public static void main(String[] args) {
		// if (args.length != 2) {
		// System.out.println("usage: ./zipf size skew");
		// System.exit(-1);
		// }

		// ZipfGenerator zipf = new ZipfGenerator(Integer.valueOf(args[0]),
		// Double.valueOf(args[1]));
		ZipfGenerator zipf = new ZipfGenerator(size, skew);

		// for(int i=0; i<10000; i++){
		// eachdata = next();
		// }
		// System.out.println("rnd " + rnd);

		for (int i = 1; i <= datasize; i++) {
			System.out.println(i + " " + zipf.getProbability(i));
		}

	}
}