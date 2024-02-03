
public class Code15_8 {

	public static void main(String[] args) {
		//replaceAll　メソッドをつかった文字列の置き換え
		
		String s ="abc,def::ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}

}
