import java.util.Date;

public class Code15_11 {

	public static void main(String[] args) {
		// 現在日時の表示
		
		Date now = new Date();     
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		
	}

}
