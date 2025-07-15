public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();            // Calls default constructor
        Calculator calc2 = new Calculator(15, 25);      // Calls parameterized constructor

        calc1.add();                                    // Adds fixed numbers 5 and 10
        calc1.add(20, 30);                             // Adds two integers
        calc1.add(12.5f, 15.5f, 10.0f);                // Adds three floats
    }
}