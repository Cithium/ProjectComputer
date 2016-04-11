package data;

public class LongWord extends Word<Long> {

	
	public LongWord(long word){
		super(word);
		
	}
	
	
	public Long getValue(){
		
		return word;
		
	}

	@Override
	public Word getValue(Memory m) {
		return this;
	}

	@Override
	public void mul(Word w1, Word w2) {
		System.out.println("// MUL //");
		System.out.println(((LongWord) w1).getValue());
		System.out.println(((LongWord) w2).getValue());
		System.out.println(word);

		word =  ((LongWord) w1).getValue() * ((LongWord)w2).getValue();
		System.out.println("\\ MUL \\");
		
	}

	@Override
	public void add(Word w1, Word w2) {
		word = ((LongWord) w1).getValue() + ((LongWord) w2).getValue();

	}

	@Override
	public boolean equals(Memory m, Word w1) {
        if (((LongWord) w1).getValue() == word) {
            return true;
        } else {
            return false;
        }
	}

}

