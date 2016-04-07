package data;

public class LongWord extends Word {

	
	public LongWord(long word){
		super(word);
		
	}
	
	private Long getValue(){
		
		return (Long) word;
		
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
		// TODO Auto-generated method stub
		
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

