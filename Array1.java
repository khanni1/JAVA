/*
take a array of numbers 10 numbers hardcode is fine.
perform the following
1. find max
2. find second min
3. replace numbers having with odd pos with even pos
*/

class ArrayOp{
	private int arr[] = {12,45,78,96,32,45,-8,0,14,-1};
	
	public static void main(String args[]){
		
		ArrayOp a1 = new ArrayOp();
		
		System.out.println("MAX : "+a1.maximum());
		System.out.println("SECOND MIN : "+a1.secondMin());
		
		
	}
	
	private int secondMin(){
		int min=0,min2=0;
		int i;
		for(i=0 ; i<arr.length ; i++){
			if(arr[i] < min){
				min2 = min;
				min = arr[i];
				
			}
			else if(arr[i] < min2 && arr[i] != min){
				min2 = arr[i];
			}
		}
		return min2;
	}
	
	private int maximum(){
		int max = 0;
		int i;
		for(i=0 ; i< arr.length ; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}