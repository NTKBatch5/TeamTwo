package two;

public class TeamTwo {

	public static void main(String[] args) {
		
		getInfo("Ali");
		
		System.out.println("Team Two Initial code...");
		
		System.out.println("Let's make some conflicts...");
		
		System.out.println("*********************");
		System.out.println("Ooops... trap");
		System.out.println("No traps");
		System.out.println("More conflicts");
		
		String teamTwo = "TrapTeam";
		
		System.out.println(teamTwo);
		
		// Im not able to see this
		//TRY IT NOW !!!!!!!!!!!!!!!
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println("Conflict");
		
		int e = 11;
		// doubled
		int c = 44;
		// Hello
	}
	
	public TeamTwo() {
		System.out.println("Get new conflict");
		
		//Hola, checking if its working

		System.out.println("conflict");

		// i belive it is working now
		
		System.out.println("first change and merge");

	}
	public static void getInfo(String name) {
		System.out.println(name);
	}
}
