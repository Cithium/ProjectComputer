package instruction;

import data.Address;
import data.Data;

public class Copy implements Instruction  {
    
	public Data data;
	public Address address;
	
	public Copy(Data d, Address a){
		
	}

	@Override
	public int execute(Memory m, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}