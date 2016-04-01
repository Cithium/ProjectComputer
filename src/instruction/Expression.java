package instruction;

import data.Address;
import data.Data;

public abstract class Expression implements Instruction {
	
	protected Data data1, data2;
	protected Address adress;
	
	public Expression(Data d, Data d2, Address a){
		
	}
	
	protected abstract void operation( Data data1 , Data data2, Data data3);

}
