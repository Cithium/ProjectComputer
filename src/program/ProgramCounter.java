package program;

public class ProgramCounter {
	int counter;
	
	public ProgramCounter() {
		counter = 0;
	}
	
	public ProgramCounter(int start) {
		counter = start;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void inc() {
		counter++;
	}
}
