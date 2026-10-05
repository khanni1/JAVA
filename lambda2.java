
@FunctionalInterface
interface Calculator{
	Double operate(Double a,Double b);
}

class exec{
	public static void main(String args[]){
	
	Calculator add = (a,b) -> {return a+b;};
	Calculator sub = (a,b) -> a-b;
	Calculator mul = (a,b) -> a*b;
	
	System.out.println(add.operate(2.0,3.0));
	System.out.println(sub.operate(10.0,3.0));
	System.out.println(mul.operate(2.0,3.0));
	
	}
	
}