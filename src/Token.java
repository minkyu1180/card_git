
public class Token {
	private int value; // ��ū ��� ���� ����
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
