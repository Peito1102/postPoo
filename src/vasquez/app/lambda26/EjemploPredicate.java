package vasquez.app.lambda26;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(12);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2 = " + t2.test("ROLE_ADMIN"));

        BiPredicate<String ,String> t3 = String::equals; //a.equals(b)
        System.out.println(t3.test("jd"," jd"));

        BiPredicate<Integer,Integer> t4 = (i,j) -> j > i;
        boolean r2 = t4.test(3,1);
        System.out.println("r2 = " + r2);

    }

}
