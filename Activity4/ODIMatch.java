
public class ODIMatch extends Match {

	@Override
	public float calculateRunRate(int y, int z,int w) {
		// TODO Auto-generated method stub
		int a=w-y;
		int b=50-z;
		float c=a/b;
		return c;
	}

	@Override
	public int calculateBalls(int y, int z,int w) {
		// TODO Auto-generated method stub
		int d=300-(z*6);
		return d;
	}
	
	@Override
	public void display(float reqRunrate, int balls) {
		System.out.println("Required Runrate:"+reqRunrate);
		
		
		System.out.println("Need"+(reqRunrate*(balls/6))+"runs in"+balls+"balls");
		
	}
	
}
