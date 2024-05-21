
public class split_consept {
	public static void main(String[] args) {
		String s1="Standard/Deluxe/Suite/Luxury/Studio";
		String s2="Standard";
		String s3="Deluxe";
		
		String[] split = s1.split("/");
		System.out.println(split);
		for (String X : split) {
			System.out.println(X);
			
		}
		String[] split2 = s2.split("/");
		for (String Z : split2) {
			System.out.println(".......................");
			System.out.println(Z);
			
		}
	}

}
