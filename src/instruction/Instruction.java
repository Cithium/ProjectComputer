package instruction;

import data.Memory;
import program.*;

public interface Instruction {
	
	public int execute(Memory m, ProgramCounter i);
	
	public String toString();

}
