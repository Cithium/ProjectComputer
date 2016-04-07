package data;

public class LongMemory implements Memory {
	
	private Word[] memory;
	
	public LongMemory(int length){
		memory = new Word[length];
		
	}

	@Override
	public void insert(int i, Word w) {
		memory[i] = w;
		
	}

	@Override
	public Word read(int i) {
		return memory[i];
	}

}
