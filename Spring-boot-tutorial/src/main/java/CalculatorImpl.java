interface Calculator {
    //    void switchOn();//abstract method
    void add(int input);
}

public class CalculatorImpl {
    public static void main(String[] args) {
//        Calculator calculator = () -> {
//            System.out.println("Switch On");//lambda expression
//        };
//        calculator.switchOn();//calling abstract method
        Calculator calculator = (input) -> System.out.println("Input is " + input);
        calculator.add(25);
    }
}
