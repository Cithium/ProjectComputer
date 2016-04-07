package instruction;

import data.Address;
import data.Data;
import data.Memory;

public class Mul extends Expression {

	public Mul(Data d1, Data d2, Address a) {
		super(d1, d2, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void operation(Memory m, Data data1, Data data2, Address address1) {
		

	}

}
