package instruction;

import data.Memory;

public interface Instruction {
	
	public int execute(Memory m, int i);

}
