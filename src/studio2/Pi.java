package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hit = 0;
		int miss = 0;
		
		for (int count =0; count <= 1000; count ++)
		{
		double x = (Math.random()*2)-1;
		double y = (Math.random()*2)-1;
		double radius = Math.sqrt(x*x +y*y);
		if (radius <= 1 && radius >= -1)
		{
			System.out.println("You hit the dartboard");
			hit++;
		}
		else 
		{
			System.out.println("You missed the dartboard");
			miss++;
		}
		}
		System.out.println("Hit times: " + hit);
		System.out.println("Miss times: " + miss);

		double circle = hit/miss+hit;
		double circlePi = circle/250;
		System.out.println(circlePi);
	}

}
