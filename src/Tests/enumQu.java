package Tests;

enum Weekday{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY	
}
public class enumQu {
	public static void main(String[] args) {
		
		Weekday w = Weekday.MONDAY;	
		switch(w) {
		case MONDAY:
			System.out.println("This is Monday");
			break;
		case TUESDAY:
			System.out.println("This is Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("This is Wednesday");
			break;
		case THURSDAY:
			System.out.println("This is Thursday");
			break;
		case FRIDAY:
			System.out.println("This is Friday");
			break;
		case SATURDAY:
			System.out.println("This is Saturday");
			break;
		case SUNDAY:
			System.out.println("This is Sunday");
			break;
		}
		
		}
		
	}

