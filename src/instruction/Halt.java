package instruction;

import data.Memory;

public class Halt implements Instruction {

	@Override
	public int execute(Memory m, int i) {
		
		return -1;
	}

}
