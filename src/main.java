import data.*;
import instruction.*;
import program.*;

public class main {

	public static void main(String[] args) {
		System.out.println("sys1");
		Program factorial = new Factorial();
		System.out.println("sys2");
		System.out.println(factorial);
		System.out.println("sys3");
		Computer computer = new Computer(new LongMemory(1024));
		System.out.println("sys4");
		computer.load(factorial);
		System.out.println("sys5");
		computer.run();
		System.out.println("sys6");
		}
	
}
