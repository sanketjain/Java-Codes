public class ArrayInitialization{
	public static void main(String[] args){
		int[][] ints = new int[3][2];
		ints[0] = new int[3];
		ints[2] = {1,2,3};
	//	ints[2] = new int[]{1,2,3};
		System.out.print(ints[0].length + ints[2].length);
	}
}
