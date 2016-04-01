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
		return 0;
	}

	@Override
	protected void operation(Data data1, Data data2, Data data3) {
		// TODO Auto-generated method stub
		
	}

}
