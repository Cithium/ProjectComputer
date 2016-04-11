package instruction;

import data.Memory;
import program.*;

public class Halt implements Instruction {

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		
		return -1;
	}
	
	public String toString(){
		return "HLT\n ";
	}

}
