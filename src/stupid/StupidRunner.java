package stupid;

public class StupidRunner
{
	
	public static void main(String[] args)
	{
		Dumb lloyd = new Dumb(0);
		Dumber harry = new Dumber();
		Dumbest george = new Dumbest();
		
		System.out.println(" Lets test inheritance.");
		
		System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("lets test more inheritance");
		harry.setBlerg(45);
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("let's do it again");
		System.out.println("harry's car: " + harry.getMyCar());
		
	}
}
