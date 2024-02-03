import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Code15_15 {

	public static void main(String[] args) {
		// LocalDateTime

		//LocalDateTimeの生成
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);

		System.out.println(l1);
		System.out.println(l2);

		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);
	}

}
