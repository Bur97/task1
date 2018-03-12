import java.util.Scanner;

class Ex1_6 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		str = str.replace(" ", "");	//удаление пробелов
		str = str.toLowerCase();	//приведение всех симоволов к одному виду

		StringBuffer buffer = new StringBuffer(str);	//создание развернутой строки
		buffer.reverse();
		String str1 = buffer.toString();
				
		if (str.contentEquals(str1)) 		//сравнение исходной строки с перевернутой
			System.out.format("Палиндром\n");
		else
			System.out.format("Не палиндром\n");		
	}

}
