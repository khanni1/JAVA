// in functional interface only 1 method
// lambda and functional interface  go hand in hand

@FunctionalInterface

interface Square{
	Double calculate(Double a);
}

class exec{
	public static void main(String args[]){
		
	Square s = (x) -> {return x*x;};
	
	Double ans = s.calculate(3.0);
	
	System.out.println(ans);
	
	ans = PrintResult(s,4.0);
	
	System.out.println(ans);
	
	 // PrintSome((Double x) -> {return x*x*x;} , 2);
		
	}
	
	static Double PrintResult(Square op,Double x){
		return op.calculate(x);
	}
	
	// static int PrintSome(){} doubt
}