/* 9. Shape Area & Perimeter Calculation 
Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle, Rectangle, and Triangle. 
Use method overriding to implement each formula. 
Store multiple shapes in an array and calculate areas/perimeters using a single loop (polymorphism). 
*/

interface Shape{
	public double calculateArea();
	public double calculatePerimeter();
	public String getName();
}

class ShapeAreaPerimeter{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		Shape shps[] = {t1,c1,r1};
		
		for (int i=0 ; i<shps.length ; i++){
		System.out.println(shps[i].calculateArea());
		System.out.println(shps[i].calculatePerimeter());
		System.out.println(shps[i].getName());
		
		}
		
		
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
	
	public String getName(){
		return "Triangle";
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
	
	public String getName(){
		return "Circle";
	}
		
}

class Rectangle implements Shape{
	double l;
	double b;
	
	Rectangle(double x,double y){
		l = x;
		b = y;
	}
	
	Rectangle(){
		l = 4;
		b = 3;
	}
	
	
	
	public double calculateArea(){
		
		double area = l*b;
		
		return area;
	}
	
	public double calculatePerimeter(){
		double peri = 2*(l+b);
		
		return peri;
	}
	
	public String getName(){
		return "Rectangle";
	}
		
}