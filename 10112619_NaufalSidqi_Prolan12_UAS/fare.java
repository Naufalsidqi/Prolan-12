package TempatFutsal;

/**
 *
 * @author Iscariot
 */
public class Fare {

	public int farecalculator(int hours,int rate,int s)
	{
			if(s==1)
			{
				return hours*rate;
			}
			
			if(s==2)
			{
				return hours*rate*2;
			}
	
	return 0;
}
}