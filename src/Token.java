
public class Token {
	private int value; // 토큰 사용 가능 여부
	Token() {
		value=1;
	}
	public int flip() {
		value^=1;
		return value;
	}
	public int get() {
		return value;
	}
	public boolean usable() {
		return get()==1?true:false;
	}
}
