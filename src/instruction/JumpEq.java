package instruction;

import data.*;
import program.ProgramCounter;

public class JumpEq implements Instruction {

	private Data d1, d2;
	private int jump;

	public JumpEq(int i, Data d1, Data d2) {
		this.d1 = d1;
		this.d2 = d2;
		this.jump = i;

	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		if (d1.getValue(m).equals(m, d2.getValue(m))) {
			return jump;
		}
		return counter.getCounter() + 1;
	}
	
	public String toString(){
		return "JEQ "+ jump + " " + d1 + ((LongWord)d2).getValue();
	}
}