package recursions;

public class Factorial {

	public static int fac(int n ) {
		if(n==0) {
			return 1;
		}
		int ans=fac(n-1);
		return n*ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(fac(10));
	}

}
