package basic;

import java.util.*;

/**
 * @author archmagece
 * @since 2017-02-13 01
 */
public class DrawRect {

	static class Point{
		int x;
		int y;
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		List<Point[]> pointsList = new ArrayList<>(n);
		Point[] rectPoint;
		for(int i=0;i<n;i++){
			rectPoint = new Point[3];
			for(int j=0;j<3;j++){
				rectPoint[j] = new Point(scanner.nextInt(), scanner.nextInt());
			}
			pointsList.add(rectPoint);
		}

		Set<Integer> setX = new HashSet<>();
		Set<Integer> setY = new HashSet<>();
		for(int i=0;i<n;i++){
			rectPoint = pointsList.get(i);
			setX.clear();
			setY.clear();
			for(int j=0;j<3;j++){
				if(!setX.remove(rectPoint[j].x)){
					setX.add(rectPoint[j].x);
				}
				if(!setY.remove(rectPoint[j].y)){
					setY.add(rectPoint[j].y);
				}
			}
			System.out.println(setX.iterator().next() + " " +setY.iterator().next());
		}
	}
}
