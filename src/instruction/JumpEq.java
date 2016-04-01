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
	public int execute(Memory m, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
