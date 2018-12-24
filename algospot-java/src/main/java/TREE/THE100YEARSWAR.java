package TREE;

import java.util.Scanner;
import java.util.TreeMap;

public class THE100YEARSWAR {


	static int T;
	static int N;
	static int Q;

	/**
	 * no - 번호로 바로 확인필요
	 * map을 별도로 관리 2 3, 3 6, 6 9, 9 11 이렇게 있을 때\
	 * T 3 이 나오면 2 3 이 1 3으로 변경. 하위는 같이 변경이나 마찬가지
	 * T 6 이 나오면 3 6 없어지고 1 6이 생성, 하위는 같이 변경이나 마찬가지
	 * 이렇게 하려면 순방향forward, 역방향reverse도 검색 필요
	 */
	static class Noble {
		int root;//1,2

		Noble(int root) {
			this.root = root;
		}
		Noble[] children;
	}

	static Noble[] nobleRefForward;
//	static Noble[] nobleRefReverse;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inFirst = in.nextLine();
		T = Integer.valueOf(inFirst.trim());

		String inSecond = in.nextLine();
		String[] splInSecond = inSecond.split("\\s");
		N = Integer.valueOf(splInSecond[0]);
		Q = Integer.valueOf(splInSecond[1]);

		System.out.println("T:" + T);
		System.out.println("N:" + N);
		System.out.println("Q:" + Q);

		assert true;
		nobleRefForward = new Noble[N-2];
		for (int i = 0; i < N - 2; i++) {
			String[] splInRelation = inSecond.split("\\s");
			int n0 = Integer.valueOf(splInRelation[0]);
			int n1 = Integer.valueOf(splInRelation[1]);
			nobleRefForward[n0] = n1;
//			nobleRefReverse[n1] = n0;
		}

		for (int i = 0; i < Q; i++) {
			String[] splInRelation = inSecond.split("\\s");
			int n1 = Integer.valueOf(splInRelation[1]);
			if (splInRelation[0].charAt(0) == 'Q') {
				int n2 = Integer.valueOf(splInRelation[2]);

			} else {//T
				while (true) {
					int result = nobleRefForward[n1-1];
					nobleRefReverse[n1-1]
				}
//				nobleRefForward[n1] = n2;
//				nobleRefForward[n2] = n1;
			}
		}

	}
}
