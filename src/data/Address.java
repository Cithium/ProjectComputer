package data;

public class Address implements Data {
    
	
	private int index;
	
	public Address(int i){
		this.index = i;
	}
	
	public int getIndex(){
		return index;
	}
	
	@Override
	public Word getValue(Memory m) {
		// TODO Auto-generated method stub
		return null;
	}

}