package practiceprograms;

public class callmethod {
	public static int para (int x, int y){
		int z= x+y;
		return z;
		
	}
	

	public static void main(String[] args) {
		
		int x=55;
		int y=77;
		int z= para(x,y);
		System.out.println("sum=" +z);

	}

}
