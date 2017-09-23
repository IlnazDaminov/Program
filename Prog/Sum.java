public class Sum {
	public static void main(String[] args) {
		double sum = 0;
		int n = Integer.parseInt(args[0]);
		for (int m=1; m <=n; m++) {
			sum += (double)Math.pow(fact(m-1),2)/fact(2*m);
		}
		System.out.println(sum);
 	}

	public static int fact(int n){
		int fact = 1;
		for (int i=2; i <= n; i++){
			fact = fact*i; 
		}
		return fact;
	}
}