package aula2402;

public class App3 {

	public static void main(String[] args) {
	int j = 1;
	
	for (int i = 0; i < 16; i++) {
		if (i %2 ==1) {
			j *= i;
		}
		
	}
	System.out.println(j);	
		
	}

}
