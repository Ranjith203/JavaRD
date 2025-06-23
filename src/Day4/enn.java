package Day4;

import java.util.Arrays;

enum direction{
	North,
	East,
	West,
	South		
}

public class enn {

	public static void main(String[] args) {
		
		direction D= direction.valueOf("East");
		System.out.println(D);
	
		direction E= direction.valueOf("South");
		System.out.println(E);

		direction B= direction.valueOf("North");
		System.out.println(B);
		
		System.out.println(Arrays.toString(direction.values()));
		
	}

}
