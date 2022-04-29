package pro.jav.Exception;

import java.io.InvalidClassException;
import java.util.Scanner;
public class errorhandling
{
	Scanner sc=new Scanner(System.in);
	int sal=sc.nextInt();
	static void salCheck(int sal) throws InvalidSal,InvalidateSal,InvalidatedSal
	{
		if(sal<2100)
		{
			throw new InvalidSal("you need to work hard");
		}
		
		if(sal<2100 || sal>5000)
		{
			throw new InvalidateSal("salary is somehow ggod");
		}
		if(sal<5100 || sal>9000)
		{
			throw new InvalidatedSal("salary is very good");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			salCheck(3440);
		}
		catch(Exception e)
		{
			System.out.println("exception ocurred : "+e.getMessage());
		}
		
	}
}
class InvalidSal extends Exception
{
	public InvalidSal(String s) 
	{
		super(s);
	}
}
class InvalidateSal extends Exception
{
	public InvalidateSal(String s) 
	{
		super(s);
	}
}
class InvalidatedSal extends Exception
{
	public InvalidatedSal(String s) 
	{
		super(s);
	}
}
