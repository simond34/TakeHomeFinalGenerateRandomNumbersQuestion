package takeHomeFinal;

public class THFinals {

	
	public static void main(String[] args) {
		
	}

	public int GetMax(int[] values) {
		int max = values[0];
		for(int i=1; i< values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}
		return max;
	}
	
	public int divide(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		return 0;
	}
}
