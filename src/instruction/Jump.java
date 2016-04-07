package instruction;

import data.Memory;

public class Jump implements Instruction {
   private int jump;
   
	public Jump(int i) {
		this.jump=i;
    
	}

	@Override
	public int execute(Memory m, int i) {
		
		return jump;
	}

}
