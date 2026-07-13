// 12 f for 12c -> xf
// hint Always use .equals() or .equalsIgnoreCase() for String comparison in Java, never ==

class TempConverter {
	public static void main(String args[]){
		if(args.length != 2){System.out.println("invalid arguments");}
		float mag = Float.parseFloat(args[0]);
		String unit = args[1];
		double value=0;
		
		if(unit.equals("F") || unit.equals("f")){
		value = (mag - 32) / 1.8;
		unit = "C";
		}
		else if(unit.equalsIgnoreCase("C")){
		value = mag*1.8 + 32;
		unit = "F";
		}
		
		System.out.print(value+" "+unit);
		
	}
}