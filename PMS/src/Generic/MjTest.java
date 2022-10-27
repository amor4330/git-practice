package Generic;

import java.util.ArrayList;

public class MjTest {

	public static void main(String[] args) {
		
		ArrayList <Integer>	ar = new ArrayList<>();
		
		ar.add(0);
		ar.add(0);
		
		
		for(int i = 1; i <= 5; i++) {
			ar.add(i);
		}
		for(int i = 1; i <= 5; i++) {
			ar.add(1, 7);
		}
		
		System.out.println(ar);
	}
}
