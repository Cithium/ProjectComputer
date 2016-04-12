package instruction;

import data.*;

import program.ProgramCounter;

public class Copy implements Instruction {

	public Data data;
	public Address address;

	public Copy(Data d, Address a) {
		this.data = d;
		this.address = a;

	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		m.insert(address.getIndex(), data.getValue(m));
		
		return counter.getCounter() + 1;
	}

	public String toString(){
		return "CPY "+ data.toString() + " " + address.toString();
	}
}
