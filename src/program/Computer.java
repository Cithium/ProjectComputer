package program;

import data.Memory;


public class Computer {
	
	//public int counter;
	public Program program;
	public Memory memory;
	public ProgramCounter programCounter;
	
	public Computer(Memory m0){
		this.memory = m0;
		
	}
    
	public void load(Program p){
		this.program = p;
		
	}
	
	public void run(){
		programCounter = new ProgramCounter();
		int k = 0;
		while (programCounter.getCounter() != -1) {
			programCounter.setCounter(program.get
					(programCounter.getCounter()).execute(memory, programCounter));
			
		}
	}
}
