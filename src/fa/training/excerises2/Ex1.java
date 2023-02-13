package fa.training.excerises2;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("((101 + 0) / 3)->" + ((101 + 0) / 3));
//        (3.0e-6 * 10000000.1)-> 30.0000003
        System.out.println( "(3.0e-6 * 10000000.1)->" + (3.0e-6 * 10000000.1));
//        (true && true)-> true
        System.out.println("(true && true)->" + (true && true));
//        (false && true)-> false
        System.out.println("(false && true)->" + (false && true));
//        ((false && false) || (true && true))-> true
        System.out.println("((false && false) || (true && true))->" + ((false && false) || (true && true)));
//        (false || false) && (true && true)-> false
        System.out.println("(false || false) && (true && true)->" + ((false || false) && (true && true)));
    }
}
