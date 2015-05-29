import java.util.Random;

public class testMyGreedy {
	public static long ReduceNum = 20;
	public static long OncePartitionNum = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long[][] assignmatrix = new long[(int) ReduceNum][(int) OncePartitionNum];
		for (int i = 0; i < ReduceNum; i++) {
			for (int j = 0; j < OncePartitionNum; j++) {
				assignmatrix[i][j] = (long) ((Math.random()) * 100);
				// System.out.println("assignmatrix[" + i + "][" + j + "]="
				// + assignmatrix[i][j]);

			}
		}

		// TODO Auto-generated method stub
		// 启发方法，调整greedy选取的结果
		long maxload = 0;
		long minload = Long.MAX_VALUE;
		long sumload = 0;
		int max_x = 0;
		int max_y = 0;
		int min_x = 0;
		int min_y = 0;
		int loop = 0;
		int flagMax = 0;
		int eachmax = 0;
		long eachmin = Long.MAX_VALUE;
		long freshmaxload = maxload;

		while (loop < 5) {
			// 查询出每轮中，最大负载节点和最小负载节点的下标
			for (int i = 0; i < ReduceNum; i++) {
				sumload = 0;
				for (int j = 0; j < OncePartitionNum; j++) {
					sumload += assignmatrix[i][j];
					System.out.println("before:" + sumload);
				}
				if (sumload > maxload) {
					maxload = sumload;
					max_x = i;
					flagMax = 1;
				}
				if (sumload < minload) {
					minload = sumload;
					min_x = i;
					flagMax = 2;
				}
			}

			if (flagMax == 1) {
				for (int i = 0; i < OncePartitionNum; i++) {
					if (eachmax < assignmatrix[max_x][i]) {
						eachmax = (int) assignmatrix[max_x][i];
						max_y = i;
					}
				}
			}
			if (flagMax == 2) {
				for (int i = 0; i < OncePartitionNum; i++) {
					if (eachmin > assignmatrix[min_x][i]) {
						eachmin = assignmatrix[min_x][i];
						min_y = i;
					}
				}
			}

			freshmaxload = maxload - assignmatrix[max_x][max_y]
					+ assignmatrix[min_x][min_y];

			if (freshmaxload < maxload) {
				int temp = (int) assignmatrix[min_x][min_y];
				assignmatrix[min_x][min_y] = assignmatrix[max_x][max_y];
				assignmatrix[max_x][max_y] = temp;

				for (int i = 0; i < ReduceNum; i++) {
					sumload = 0;
					for (int j = 0; j < OncePartitionNum; j++) {
						sumload += assignmatrix[i][j];
						System.out.println("after:" + sumload);
					}
				}
			}else{
				break;
			}
			loop++;
		}
		System.out.print(loop);
	}
}






//// 启发方法，调整greedy选取的结果
//int maxload = 0;
//int minload = Integer.MAX_VALUE;
//int sumload = 0;
//int max_x = 0;
//int max_y = 0;
//int min_x = 0;
//int min_y = 0;
//int loop = 0;
//int flagMax = 0;
//int eachmax = 0;
//int eachmin = Integer.MAX_VALUE;
//int freshmaxload = 0;
//
//while (loop < 5) {
//	// 查询出每轮中，最大负载节点和最小负载节点的下标
//	for (int i = 0; i < ReduceNum; i++) {
//		sumload = 0;
//		for (int j = 0; j < OncePartitionNum; j++) {
//			if(assignmatrix[i][j] != -1){
//				sumload += assignmatrix[i][j];	
//			}
//		}
//		if (sumload > maxload) {
//			maxload = sumload;
//			max_x = i;
//			flagMax = 1;
//		}
//		if (sumload < minload) {
//			minload = sumload;
//			min_x = i;
//			flagMax = 2;
//		}
//	}
//
//	if (flagMax == 1) {
//		for (int i = 0; i < OncePartitionNum; i++) {
//			if ((eachmax < assignmatrix[max_x][i]) && (assignmatrix[max_x][i] != -1) ) {
//				eachmax = (int) assignmatrix[max_x][i];
//				max_y = i;
//			}
//		}
//	}
//	if (flagMax == 2) {
//		for (int i = 0; i < OncePartitionNum; i++) {
//			if ((eachmin > assignmatrix[min_x][i]) && (assignmatrix[min_x][i] != -1) ) {
//				eachmin = assignmatrix[min_x][i];
//				min_y = i;
//			}
//		}
//	}
//
//	freshmaxload = maxload - assignmatrix[max_x][max_y]
//			+ assignmatrix[min_x][min_y];
//
//	if (freshmaxload < maxload) {
//		int temp = assignmatrix[min_x][min_y];
//		assignmatrix[min_x][min_y] = assignmatrix[max_x][max_y];
//		assignmatrix[max_x][max_y] = temp;
//	} else {
//		break;
//	}
//	loop++;
//}
