import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @category 采用蒙特卡罗方法生成zipf分布随机数据
 * @author wzhuo
 * 
 */

public class zipf_datasets {

	private static final double RAND_MAX = 0;
	int datanum = 10; // 不同原组的个数
	double A = 1.0; // 定义参数A>1的浮点数, 倾斜的控制系数
	double C = 1.0; // 这个C是不重要的,一般取1, 可以看到下面计算中分子分母可以约掉这个C

	double[] pf = new double[30]; // 值为0~1之间, 是单个f(r)的累加值

	void generate() {
		double sum = 0.0;
		for (int i = 0; i < datanum; i++) {
			sum += C / Math.pow((double) (i + 2), A); // 位置为i的频率,一共有r个(即秩), 累加求和
		}

		for (int i = 0; i < datanum; i++) {
			if (i == 0)
				pf[i] = C / Math.pow((double) (i + 2), A) / sum;
			else
				pf[i] = pf[i - 1] + C / Math.pow((double) (i + 2), A) / sum;
		}
	}

	void pick(int n) {
		// 产生n个数
		try {
			FileWriter fw = new FileWriter("/home/wzhuo/example/zipf_6", true);
			PrintWriter bw = new PrintWriter(fw);

			for (int i = 0; i < n - 1; i++) {
				int index = 0;
				double data = (double) Math.random(); // 生成一个0~1的数
				while (data > pf[index]) {// 找索引,直到找到一个比他小的值,那么对应的index就是随机数了
					if (index >= datanum) {
						break;
					}
					index++;
				}
				System.out.println(index);
				bw.println(index);
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zipf_datasets a = new zipf_datasets();
		a.generate();
		a.pick(30);

		// return 1;
	}

}
