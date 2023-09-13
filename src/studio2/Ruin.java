package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	
		int startAmount, winLimit;
		double winChance;
		winLimit = 10;
		int money;
		int winCount = 0;
		int lossCount = 0;
		Scanner scan = new Scanner(System.in);
		startAmount = 5;
		money =  startAmount;
		System.out.println("You are starting with " + money + "$");
		
		for ( int day = 1; day <= 50; day ++ ) // Day Loop
			{
			int round = 0;
			startAmount= 5;
			money = 5;
			round = 0;
			
		while( (money > 0) && money<=winLimit ) // Round Loop
		{
			winChance = Math.random() ;
			if (winChance >= .5) 
			{
				round ++;
				money ++;
				winCount ++;
		
			}
			else
			{
				round ++;
				money --;
				lossCount++;
			
		

			}
		}
		System.out.println("Day " + day + ": " + "You played " + round + " times today. You lost " + lossCount + " times." + " You won " + winCount + " times." + "You have " + money + "$ left.");
		System.out.println("");
		}
	

}

	private static Object day(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

