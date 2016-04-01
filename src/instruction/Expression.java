package instruction;

import data.Address;
import data.Data;

public abstract class Expression implements Instruction {
	
	protected Data data1, data2;
	protected Address address;
	
	public Expression(Data d, Data d2, Address a){
		this.data1 = d;
		this.data2 = d2;
		this.address = a;
		
	}
	
	protected abstract void operation( Data data1 , Data data2, Data data3);

}
