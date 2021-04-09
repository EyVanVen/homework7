package task2;

public class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println("\u001B[31m"  + error);
            }
        };

        errorPrinter.printError("Fatal error occurred. Please, fix your code!");
    }
}
