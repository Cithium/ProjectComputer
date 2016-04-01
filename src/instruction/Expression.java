package instruction;

import data.Address;
import data.Data;
import data.Memory;

public abstract class Expression implements Instruction {
	
	protected Data data1, data2;
	protected Address address;
	
	public Expression(Data d1, Data d2, Address a){
		this.data1 = d1;
		this.data2 = d2;
		this.address = a;
		
	}
	
	protected abstract void operation( Data data1 , Data data2, Data data3);
	
	public int execute(Memory m, int i){
		return i;
		
	}

}
