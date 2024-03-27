import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2007, mon - 1, day);
        System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase());
    }
}