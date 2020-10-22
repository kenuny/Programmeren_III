package cui;

import java.util.Collection;

public class VoorbeeldMetWildcard {

	public static void main(String[] args) 
	{
		

	}
	
	public static double sum(Collection <? extends Number> col)
	{
		return 0.0;
	}
	
	public static <T extends Number> double sum2 (Collection <T> col)
	{
		return 0.0;
	}
}
