public class Main {
    public static void main(String[] args) {

        Driver myDriver = new Driver();
        // This is the lambda expression

        MyFunction printFun = (int i) -> i ;

        myDriver.applyAndPrint(printFun, 1, 5);
    }


}