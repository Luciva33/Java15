
public class Main5 {

	public static void main(String[] args) {
		// 書式整形
		
		String name = "minato";
		String job = "hero";
		int money = -10002800;
		
		String s = String.format("%-9s %-13s 所持金%,06d\n",name,job,money );
		
		//9文字分の枠を開けて右寄りに文字列を寄せる
		//全角文字の書式制限
		System.out.println(s);
	}

}
