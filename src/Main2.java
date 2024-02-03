
public class Main2 {

	public static void main(String[] args) {

		String s = " Java";

		System.out.println(s.toLowerCase()); 
		//大文字を小文字に
		System.out.println(s.toUpperCase());
		//小文字を大文字に
		System.out.println(s.replace("a", "x"));
		//文字列を置き換える
		System.out.println(s.trim());
		//前後の空白を除去する　全角スペースは除去しない
		System.out.println(s);
	}

}
