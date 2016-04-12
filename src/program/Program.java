package program;


import java.util.ArrayList;

import instruction.Instruction;

public class Program extends ArrayList<Instruction> {
	
	public Program(){
		
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for( Instruction inst: this){
			sb.append(i + " " + inst.toString() + "\n");
			i++;
		}
		sb.append("\n");
		return sb.toString();
	}
}
