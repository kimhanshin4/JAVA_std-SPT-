package JAVA_std.Week04.HW.CalculatorFolder;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {

            //
            try {
               calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}