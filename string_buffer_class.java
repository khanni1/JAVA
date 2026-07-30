class Mainsb {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("hello World");
		
        System.out.println(sb); 
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(5));
		
		sb.setCharAt(3,'*');
		sb.setCharAt(4,'*');
		
		System.out.println(sb);
		
		System.out.println(sb.append(" of Java"));
		
		sb.reverse();
		
		System.out.println(sb);
		
		int starPOS = sb.indexOf("**");
		
		String temp = sb.toString().replace("**","ol"); 
		// .replace is a string method so first stringbuf is convertred toString
		
		sb = new StringBuffer(temp);
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
    }
}