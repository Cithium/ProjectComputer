package data;

public class LongWord extends Word {
	
	
	public LongWord(long word){
		super(word);
		
	}
	
	public Long getValue(){
		
		return (Long) word;
		
	}

	@Override
	public Word getValue(Memory m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mul(Word w1, Word w2) {
		
		
	}

	@Override
	public void add(Word w1, Word w2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Word w1) {
		// TODO Auto-generated method stub
		return false;
	}

}
