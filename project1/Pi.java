public class Pi {
	public static void main(String[] args) {

	   try {
		int n = Integer.parseInt(args[0]);
		// System.out.println((2*n*2*n)/((2*n-1)*(2*n+1)));

		double pi = 1;
		for (int i=1;i<=n ; i++ ) {
			int up = (4*i*i);
			int down = ((2*i-1)*(2*i+1));
			pi*=(double) up/down;
		} System.out.println("pi="+pi*2);
	 
        } catch(ArrayIndexOutOfBoundsException e){
	 	 
	 		System.out.println("parsing error " );
	 	}
}

}