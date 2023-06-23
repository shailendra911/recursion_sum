package recursions;

public class Sum {
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int ans = sum(n-1);
		return n+ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(10));
	}

}
