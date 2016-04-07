package instruction;

import data.Address;
import data.Data;
import data.Memory;

public class Copy implements Instruction {

	public Data data;
	public Address address;

	public Copy(Data d, Address a) {
		this.data = d;
		this.address = a;

	}

	@Override
	public int execute(Memory m, int i) {
		m.insert(address.getIndex(), data.getValue(m));
		
		return ++i;
	}

}
