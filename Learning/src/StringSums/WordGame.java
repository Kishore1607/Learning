package StringSums;
import java.util.*;

public class WordGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> stringsList = new ArrayList<>();
        String a = sc.nextLine();
        stringsList.add(a);

        while (!a.equals("###")) {
            String b = sc.nextLine();
            char f = a.charAt(a.length() - 1);
            if (f == b.charAt(0)) {
                stringsList.add(b);
            }
            a = b;
        }

        for (String str : stringsList) {
            System.out.println(str);
        }
    }
}

