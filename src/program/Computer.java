package program;

import data.Memory;


public class Computer {
	
	public int counter;
	public Program program;
	public Memory memory;
	
	public Computer(Memory m0){
		this.memory = m0;
		
	}
    
	public void load(Program p){
		this.program = p;
		
	}
	
	public void run(){
		counter = 0;
		while (counter != -1) {
			program.get(counter).execute(memory, counter);
		}
	}
}
