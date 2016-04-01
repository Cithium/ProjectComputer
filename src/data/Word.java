package data;

public abstract class Word {
	
	protected Element word;
	
	public abstract Word getValue(Memory m);
	
    public abstract void mul(Word w1, Word w2);

   

   }
