package instruction;

import data.Address;
import data.Data;
import data.Memory;
import program.ProgramCounter;

public class Mul extends Expression {

	public Mul(Data d1, Data d2, Address address) {
		super(d1, d2, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		operation(m,d1,d2,address);
		return counter.getCounter() + 1;
	}

	@Override

	protected void operation(Memory m, Data d1, Data d2, Address adress) {
		address.getValue(m).mul(d1.getValue(m), d2.getValue(m));

	}

}
