public class Circle{
	public static void main(String[] args) {
		
	 	try { 
	 		int arg=Integer.parseInt(args[0]);
	 		System.out.println("S = "+Math.PI *  Math.pow(arg,2));
	 		System.out.println("L = "+Math.PI * arg * 2);

	 	}catch(NumberFormatException |  ArrayIndexOutOfBoundsException e){
	 	 
	 		System.out.println("parsing error " +e.getMessage());
	 	}

	 } 
}