import java.util.ArrayList;

public class Fizz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    public static String Go(int i) {
        String r = "";

        if (i % 3 == 0 && i % 5 == 0) {
            r = "FizzBuzz";
        } else if (i % 3 == 0) {
            r = "Fizz";
        } else if (i % 5 == 0) {
            r = "Buzz";
        } else {
            r = "" + i;
        }
        return r;
    }

    public ArrayList<String> GoAll(int n) {
        int i;
        ArrayList<String> ali = new ArrayList<String>();

        for (i = 1; i < n; i++) {
            ali.add(Go(i));
            System.out.println(Go(i));
        }
        return ali;
    }

}
