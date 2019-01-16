public class Main {

	public static void main(String[] args) {
		double area = calculateCircleArea(15.5);
		System.out.println(area);
	}

	public static double calculateCircleArea(double args) {
		double area =  args*args*Math.PI;
		return area;
	}
}
