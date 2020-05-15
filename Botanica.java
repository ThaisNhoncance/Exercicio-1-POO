package classes;

public class Botanica {

	public static void main(String[] args) {
	
	System.out.println("______ _             _   _       _             _____ _                \r\n" + 
			"| ___ \\ |           | | (_)     | |           |_   _(_)               \r\n" + 
			"| |_/ / | __ _ _ __ | |_ _ _ __ | |__   __ _    | |  _ _ __ ___   ___ \r\n" + 
			"|  __/| |/ _` | '_ \\| __| | '_ \\| '_ \\ / _` |   | | | | '_ ` _ \\ / _ \\\r\n" + 
			"| |   | | (_| | | | | |_| | | | | | | | (_| |   | | | | | | | | |  __/\r\n" + 
			"\\_|   |_|\\__,_|_| |_|\\__|_|_| |_|_| |_|\\__,_|   \\_/ |_|_| |_| |_|\\___|\r\n" + 
			"                                                                     ");
		
	Plantas p1 = new Plantas("Rosa", 3, true, false);
	System.out.print(p1.toString());
	
	p1.tomarSol();
	System.out.print(p1.toString());
	
	p1.regarPlanta();
	System.out.print(p1.toString());
	
	p1.podarPlanta();
	System.out.print(p1.toString());
	
}
}