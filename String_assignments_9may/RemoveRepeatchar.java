import java.util.Scanner;

class RemoveRepeatChar{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		str = str.replace(" " , "");
		String newStr = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
			{
				newStr = newStr + str.charAt(i);
			}
			else{
				String ch = String.valueOf(str.charAt(i));
				if(!newStr.contains(ch))
					newStr = newStr + str.charAt(i);
			}
		}
		System.out.println(newStr);
	}
}