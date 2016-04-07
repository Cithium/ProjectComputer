package instruction;

import data.Data;
import data.Memory;

public class JumpEq implements Instruction {

	private Data d1, d2;
	private int jump;

	public JumpEq(int i, Data d1, Data d2) {
		this.d1 = d1;
		this.d2 = d2;
		this.jump = i;

	}

	@Override
	public int execute(Memory m, int i) {
		if (d1.getValue(m).equals(m, d2.getValue(m))) {
			return jump;
		}
		return ++i;
	}
}