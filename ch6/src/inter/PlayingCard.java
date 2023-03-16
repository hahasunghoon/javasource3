package inter;

public interface PlayingCard {
	public static final int SPADE =4;
	final int DIAMOND = 3; //public static final int DIAMOND =3; 이랑 같다
	static int HEART = 2 ;   //public static final int HEART = 2; 이랑 같다
	int CLOVER = 1;             //public static final int CLOVER = 1; 이랑 같다

	public abstract String getCardNumber();
	String getCardkind(); // public abstract String getCardkind(); 랑 같다
}
