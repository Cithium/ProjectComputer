package data;

public abstract class Word<T> implements Data {
	
	protected T word;
	
	public Word(T word ){
		this.word = word;
	}
	
	
	public abstract Word getValue(Memory m);
	
    public abstract void mul(Word w1, Word w2);
    
    public abstract void add(Word w1, Word w2);
   

   }
