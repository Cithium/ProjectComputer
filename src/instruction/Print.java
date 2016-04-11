package instruction;

import data.Address;
import data.Data;
import data.Memory;
import program.ProgramCounter;

public class Print implements Instruction {

	public Data data;

	public Print(Data d) {
		this.data = d;
	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {
		System.out.println("PRINT: " + data.getValue(m));
		return counter.getCounter() + 1;
	}
	
	public String toString(){
		return "PRT" + "[" + ((Address)data).getIndex() + "]";
	}

}
