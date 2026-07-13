class SampleOne {
	public static void main(String args[]){
		// default
		String x="1",y="khanjan";
		if(args.length >= 2){
			x = args[0];
			y = args[1];
		}

		System.out.println("java code running "+x+" time, by "+y);
	}
}