public class Task7 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum=0;
		for (int i=1;i<=n ; i++ ){
			sum += Math.pow(-1, i+1)*(1/Math.pow((2*i-1),2));
		}
		System.out.println(sum);
	}
}