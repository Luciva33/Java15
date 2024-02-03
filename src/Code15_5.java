import java.util.Scanner;

public class Code15_5 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.print("名前を入力>>");
			String name = new Scanner(System.in).next();
			if(isValidPlayerName(name)) {
				System.out.println("OK");
			}else {
				System.out.println("NG");
			}
		}
	}
	
	public static boolean isValidPlayerName(String name) {
	
//		if(name.length() != 8) {
//			return false;
//		}
//		
//		char first = name.charAt(0);
//		if(!(first >= 'A' && first <= 'Z'  )) {
//			return false;
//		}
//		
//		for(int i =0; i < 8; i++) {
//			char c = name.charAt(i);
//			if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
//				return false;
//			}
//		}
//		
//	
//		return true;
		
		//文字列パターンを用いたプレイヤー名のチェック
		
		//return name.matches("[abc]{4,}");//abc以外許さない *は0回以上の繰り返し
		//return name.matches("[a-zA-Z0-9]{1,5}");//1~5文字以下 [a-z]までの文字を使います
		return name.matches("[あ-んア-ン0-9]{1,5}");
	}	
}
