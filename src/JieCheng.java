
public class JieCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static public long jiecheng(int x) {
		long he = 1;
		while(x>0) {
			he = x*he;
			x--;
		}
		return he;
	}

}
