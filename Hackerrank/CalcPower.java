public class CalcPower{
	public static void main(String[] args){
		System.out.println(calculatePower(2, 16));
	}

	public static long calculatePower(long p, long q){
		 if (q == 0)  {      
		 	return 1; 
		 } else if (q==1){
		 	return p;
		 } else if ((q/2)==0) {
		 return calculatePower ( p*p, q/2);
		 } else    {
	       return a * pow ( a * a, b/2); 
	   }
	}

}