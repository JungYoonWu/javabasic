package _06Challenge;

public class Programing03 {

	public static void main(String[] args) {
		Point t1 = new Point(3,4);
		Point t2 = new MovablePoint(4,5,10,12);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
	static class Point{
		private int x, y;
		
		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "x 좌표 : " + x + ", y 좌표 : "+y +"\n";
		}
	}
	
	static class MovablePoint extends Point{
		private int xSpeed, ySpeed;

		public int getxSpeed() {
			return xSpeed;
		}

		public int getySpeed() {
			return ySpeed;
		}
		public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
			super(x, y);
			this.xSpeed = xSpeed;
			this.ySpeed = ySpeed;
		}
		
		public String toString() {
			return "x 좌표 : " + getX() + ", y 좌표 : " + getY() + "\n" + "x로 이동속도 : " + xSpeed + "\n"+"y로 이동속도 : " + ySpeed;
		}
	}
}
