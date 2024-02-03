import java.util.Calendar;
import java.util.Date;

public class Code15_12 {

	public static void main(String[] args) {
		// 6つのint値とDate型の相互変換

		Calendar c = Calendar.getInstance();

		//６つのint値からDateインスタンスを生成

		c.set(2019, 8, 22, 1, 23, 45);   //わずわらしいが、9月をだしたいときは８と入力
		c.set(Calendar.MONTH, 9);
		
		Date d = c.getTime();
		System.out.println(d);

		//Dateインスタンスからint値を生成

		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
