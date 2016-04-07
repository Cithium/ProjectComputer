package data;

public class LongWord extends Word {

	
	public LongWord(long word){
		super(word);
		
	}
	
	private Long getValue(){
		
		return (long) word;
		
	}

	@Override
	public Word getValue(Memory m) {
		return this;
	}

	@Override
	public void mul(Word w1, Word w2) {
		
		
	}

	@Override
	public void add(Word w1, Word w2) {
		word = ((LongWord) w1).getValue() + ((LongWord) w2).getValue();
		
	}

	@Override
	public boolean equals(Memory m, Word w1) {
		if (w1.getValue(m).equals(word)){
			return true;
		}else{
			return false;
		}
	}

}

