package instruction;

import data.Address;
import data.Data;
import data.Memory;

public abstract class Expression implements Instruction {
	
	protected Data d1, d2;
	protected Address address;
	
	public Expression(Data d1, Data d2, Address address){
		this.d1 = d1;
		this.d2 = d2;
		this.address = address;
		
	}
	
	protected abstract void operation(Memory m, Data data1 , Data data2, Address adress1);
	
	public int execute(Memory m, int i){
		return i;
		
	}

}
