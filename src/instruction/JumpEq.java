package instruction;

import data.Data;
import data.Memory;

public class JumpEq implements Instruction {

	private Data data1, data2;
	private int jump;

	public JumpEq(int i, Data d, Data d2) {
		this.data1 = d;
		this.data2 = d2;
		this.jump = i;

	}

	@Override
	public int execute(Memory m, int counter) {
		if (data1.getValue(m).equals(m, data2.getValue(m))) {
			counter = jump;
			return counter;
		}
		return ++counter;
	}
}