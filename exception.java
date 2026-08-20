import java.lang.*;
import java.util.*;

class employee{
	Integer id;
	String name;
}

class RuntimeErr{
	public static void main(String args[]){
		
		
		try {
		Object a[] = new Integer[] {1,2,3,4,5,6};
		String s = "khanjan"; // characters 7		
		employee e = new employee();
		
		Object d1 = 3.5;
		Object s1 = new String("Hello");
		char ch;
		
		
		System.out.println("a0");
		
		
		// a[1] = s1;  // array store exception string into int array
	
		System.out.println("a1");
		
		
		// a[2] =  d1;// array store exception double into int array
		
		System.out.println("a2");
			
		ch = s.charAt(10); // string out of bound
		
		System.out.println("a3");
			
		ch = s.charAt(-1); // string negative index error
		System.out.println("a4");
		
		int z = e.id; //null pointer exception
		
		// System.out.println(e.id);
		System.out.println("a5");
			
			
		}
		catch (ArrayStoreException e){
			System.out.println("Array store error");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// e.printStackTrace();
			
			
		}
		
		catch (NullPointerException e){
			System.out.println("null pointer exception");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// e.printStackTrace();
			
			
		}
		
		catch(StringIndexOutOfBoundsException e){
			System.out.println("string out of bound exception");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// e.printStackTrace();
			
			
			
		}
		
		catch(Exception e){
			System.out.println("general exception");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// e.printStackTrace();
			
			
			
		}
		finally {
			System.out.println("I will always run !");
		}
	}
}



/*
StringIndexOutOfBoundsException: "khanjan" has a 
length of 7 (indices 0–6). Requesting index 10 passes compilation 
but fails at runtime.  

NullPointerException: e is instantiated, but its field e.id 
(an Integer wrapper) defaults to null. Assigning e.id to a primitive int z triggers auto-unboxing 
(calling null.intValue()), which crashes at runtime
*/


/*
Catch Block Hierarchy & Order Rules
Subclasses First, Superclass Last: 
Specific exceptions (ArrayStoreException, NullPointerException, StringIndexOutOfBoundsException) must be listed before the 
general catch (Exception e).  

Rule: If you put catch (Exception e) at the top, it will intercept 
all errors, making the specific catch blocks unreachable and causing 
a compile error. 
*/