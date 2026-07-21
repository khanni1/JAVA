// inheritence, overriding, constructor, static functions and methods


// DISCLAIMER i used double instead of float because in java say 120.232 defaults to double not float so if needed to use float than 120.232f
class Vehicle{
    String brand;
    double maxspeed;
        Vehicle(String b,double ms){
            brand = b;
            maxspeed = ms;
        }

        void displayDetails(){
            System.out.println("Brand: " + brand + " | Max Speed: " + maxspeed + " km/h");
        }
}

class ElectricVechicle extends Vehicle{
	double batteryCapacity;
	
	ElectricVechicle(String b,double ms,double bc){
		super(b,ms);
		batteryCapacity = bc;
	}
	
	void displayDetails(){
		super.displayDetails();
		System.out.println("Battery capacity : "+batteryCapacity);
	}
	
	double estimatedRange(double factor){
		return batteryCapacity*factor;
	}
    
}

class mainClass {
	public static void main(String args[]){
		ElectricVechicle e1 = new ElectricVechicle("TATA",220,1000);
		
		e1.displayDetails();
		System.out.println("Range "+e1.estimatedRange(6.5));
		
		Vehicle v1 = new Vehicle("Mahindra",230);
		
		v1.displayDetails();
	}
}