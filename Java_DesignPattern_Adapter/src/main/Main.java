package main;

public class Main {
	
	public static void main(String[] args) {
		
		adapter_1.Print p1 = new adapter_1.PrintBanner("Hello");
		p1.printWeak();
		p1.printStrong();
		
		adapter_2.Print p2 = new adapter_2.PrintBanner("Bye");
		p2.printWeak();
		p2.printStrong();
	}

}
