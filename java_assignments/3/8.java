/* 9. Shape Area & Perimeter Calculation 
Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle, Rectangle, and Triangle. 
Use method overriding to implement each formula. 
Store multiple shapes in an array and calculate areas/perimeters using a single loop (polymorphism). 
*/

interface Shape{
	public double calculateArea();
	public double calculatePerimeter();
}

class ShapeAreaPerimeter{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Circle c1 = new Circle(12);
		
		System.out.println(t1.calculateArea());
		System.out.println(t1.calculatePerimeter());
		
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculatePerimeter());
		
	}
	
	
}

class Triangle implements Shape{
	double s1;
	double s2;
	double s3;
	
	Triangle(double x,double y,double z){
		s1 = x;
		s2 = y;
		s3 = z;
	}
	
	Triangle(){
		s1 = 12;
		s2 = 14;
		s3 = 15;
	}
	
	
	
	public double calculateArea(){
		double s = (s1+s2+s3)/2.0;
		
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		return area;
	}
	
	public double calculatePerimeter(){
		double peri = s1+s2+s3;
		
		return peri;
	}
		
}

class Circle implements Shape{
	double rad;
	double pi = 3.1415;
	
	Circle(double x){
		rad = x;
	}
	
	Circle(){
		rad = 4;
	}

	
	public double calculateArea(){
		double area = pi*rad*rad;		
		return area;
	}
	
	public double calculatePerimeter(){
		double peri = 2*pi*rad;
		
		return peri;
	}
		
}