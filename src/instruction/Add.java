package instruction;

import data.Address;
import data.Data;
import data.Memory;

public class Add extends Expression {

	public Add(Data d1, Data d2, Address a) {
		super(d1, d2, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, int i) {
		// TODO Auto-generated method stub
		operation(m, data1, data2, address);
		return 0;
	}

	@Override
	protected void operation(Memory m, Data data1, Data data2, Address address1) {
		address1.getValue(m).add(data1.getValue(m), data2.getValue(m));
		
	}

}
