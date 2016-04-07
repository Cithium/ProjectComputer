package instruction;

import data.Address;
import data.Data;
import data.Memory;

public class Mul extends Expression {

	public Mul(Data d1, Data d2, Address address) {
		super(d1, d2, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, int i) {
		operation(m,d1,d2,address);
		return 0;
	}

	@Override

	protected void operation(Memory m, Data d1, Data d2, Address adress) {
		address.getValue(m).mul(d1.getValue(m), d1.getValue(m));

	}

}
