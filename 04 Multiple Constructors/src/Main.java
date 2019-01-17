
public class Main {

	public static void main(String[] args) {
		Triangle scaleneTriangle = new Triangle(10, 9, 7.5f);
		float scaleneTrianglePerimeter = scaleneTriangle.calculatePerimeter();
		System.out.println("Scalene triangle perimeter = " + scaleneTrianglePerimeter);
		// Prints ‘Scalene triangle perimeter = 26.5’

		Triangle equilateralTriangle = new Triangle(10);
		float equilateralTrianglePerimeter = equilateralTriangle.calculatePerimeter();
		System.out.println("Equilateral triangle perimeter = " + equilateralTrianglePerimeter);
		// Prints ‘Equilateral triangle perimeter = 30.0’

	}

	private static class Triangle {
		private float a;
		private float b;
		private float c;


		Triangle(float d, float e, float f) {
			a = d;
			b = e;
			c = f;

		}

		Triangle(float sideLength){
			a = sideLength;
			b = sideLength;
			c = sideLength;
		}

		public float calculatePerimeter() {

			float sum = a + b + c;
			return sum;

		}

	}

}


