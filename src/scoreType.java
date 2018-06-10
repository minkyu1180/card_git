import java.util.ArrayList;
import java.util.Collections;

public class scoreType {
	enum scoreBoard {nope, pair, __, triple, straight, flush, fourCard, st_flush}; //?�� , 2��, ?��, 3��, 5��, 5��, 4��, 5��
	public static int validate(Score_candi rawCandi) {
		Collections.sort(rawCandi);
		if (rawCandi.size() < 2 || rawCandi.size() > 5) return -1; //��������
		if (rawCandi.size() == 5) { // ��Ʈ����Ʈ, �÷���, ��Ʈ_��
			if (rawCandi.isShapeSame()) {
				if (rawCandi.isValueStraight()) {
					return scoreBoard.st_flush.ordinal();
				}
				else {
					return scoreBoard.flush.ordinal();
				}
			}
			else if (rawCandi.isValueSame()) {
				return scoreBoard.straight.ordinal();
			}
			else return -1;
		}
		if (rawCandi.size() == 4) {
			if (rawCandi.isShapeSame()) {
				return scoreBoard.fourCard.ordinal();
			}
			else return -1;
		}
		return true;
	}
	
}
