package eduu;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A' ;
		int num = 'A';
		System.out.println("num = " + num);
		char [] alphabet =new char[26];
		
		for (int i = 0 ; i < alphabet.length ; i++) {
			alphabet[i] = (char) ((int)letter +i);//letter가 정수로 바뀌어서 i랑 더해짐 + char로 ()가 씌워져 다시 문자로 바뀜
		}
		for(char c : alphabet) {
			System.out.println(c);
		}

	}

}
