import java.util.ArrayList;

// fun fact JAVA allows jagged 2d arrays or arrays of arrays aa = [a1,a2,a3..,an] where a1,a2,a3,..an can have diff lenghts

class mainClass{
	public static void main(String args[]){
		ArrayList <Integer> ai = new ArrayList<>();
		ArrayList <Double> ad = new ArrayList<>();
		ArrayList <String> as = new ArrayList<>();

		ArrayList <String> temp = new ArrayList<>();

		ai.add(2);
		ai.add((int)4.5);
		ai.add(6);

		ad.add(3.14);
		ad.add(31.4);
		ad.add(34d); 
		// ad.add((double)34);
		// ad.add(Double.parseDouble("34"));  for only string to double 
		// PARSE IS USED FROM STRING TO INT,DOUBLE,ETC

		as.add("swayam");
		as.add("kushal");
		as.add("khanjan");

		temp = as;

		printArrayList(ai);
		printArrayList(ad);
		printArrayList(as);

		as.set(1,"Bhau"); // as is modified temp also gets modified as its pointing to same object in memory

		printArrayList(temp);

		// .get() , .set() , .add() , .length ,are some ArrayList Methods
	}

	public static <T> void printArrayList(ArrayList<T> arr){
		for(T i : arr){
			System.out.print(i+"| ");
		}
			System.out.println();
	}

}


