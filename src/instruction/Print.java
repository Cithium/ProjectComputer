package instruction;

import data.Data;
import data.Memory;
import program.ProgramCounter;

public class Print implements Instruction {

	public Data data;

	public Print(Data d) {
		this.data = d;
	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		System.out.println("PRINT: " + data.getValue(m).getValue());
		return counter.getCounter() + 1;
	}

}
