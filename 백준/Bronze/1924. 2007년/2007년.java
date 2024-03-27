import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(2007, mon - 1, day);
        
        int yoil = cal.get(Calendar.DAY_OF_WEEK);
        
        switch (yoil) {
            case Calendar.SUNDAY:
                System.out.println("SUN");
                break;
            case Calendar.MONDAY:
                System.out.println("MON");
                break;
            case Calendar.TUESDAY:
                System.out.println("TUE");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("WED");
                break;
            case Calendar.THURSDAY:
                System.out.println("THU");
                break;
            case Calendar.FRIDAY:
                System.out.println("FRI");
                break;
            case Calendar.SATURDAY:
                System.out.println("SAT");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}