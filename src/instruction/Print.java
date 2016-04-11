package instruction;

import data.Data;
import data.Memory;

public class Print implements Instruction {

	public Data data;

	public Print(Data d) {
		this.data = d;
	}

	@Override
	public int execute(Memory m, int i) {
		System.out.println("PRINT: " + data.getValue(m).getValue());
		return ++i;
	}

}
