package instruction;

import data.Address;
import data.Data;
import data.Memory;

public class Add extends Expression {
    
    
	public Add(Data d1, Data d2, Address address) {
		super(d1, d2, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, int i) {
		operation(m, d1, d2, address);
		return 0;
	}

	@Override
	protected void operation(Memory m,Data d1, Data d2, Address address1) {
		address.getValue(m).add(d1.getValue(m), d2.getValue(m));
		
	}

}
