
public class Main {
    public static void main(String[] args) {

        Calculator calcu = new Calculator(9, 3);
        //Calculator calcu = new Calculator();

        System.out.println(calcu.getNum1() + " and " + calcu.getNum2());

        System.out.println("addition: " + calcu.add());
        System.out.println("subtraction: " + calcu.sub());
        System.out.println("multiplication: " + calcu.multiply());
        System.out.println("division: " + calcu.div());
    }
}