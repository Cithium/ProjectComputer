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
		int k = 0;
		while (counter != -1) {
			System.out.println(counter);
			counter = program.get(counter).execute(memory, counter);
			System.out.println("ADDRESS 0: " + memory.read(0).getValue());
			if (k > 0) System.out.println("ADDRESS 1: " + memory.read(1).getValue());
			k++;
		}
	}
}
