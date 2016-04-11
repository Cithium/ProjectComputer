package instruction;

import data.Memory;
import program.ProgramCounter;

public class Jump implements Instruction {
   private int jump;
   
	public Jump(int i) {
		this.jump=i;
    
	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		
		return jump;
	}

}
