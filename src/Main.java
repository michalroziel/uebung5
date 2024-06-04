public class Main {
    public static void main(String[] args) {

        Driver myDriver = new Driver();
        // This is the lambda expression

        MyFunction printFun = (int i) -> i ;

        myDriver.applyAndPrint(printFun, 1, 5);


        System.out.println("************ exercise b ************");

        System.out.println( "exercise 5b1 using lambda expression:");

        MyFunction squareFun = (int i) -> i * i;
        // TODO: is this correct? as we have x and y
        myDriver.applyAndPrint(squareFun, 2, 5);


        System.out.println("exercise 5b1 using anonymous class:");
        MyFunction obj = new MyFunction()
        {
            public int apply(int i)
            {
                return i * i;
            }
        };


        System.out.println("************ ******* ************");

        System.out.println( "exercise 5b2 using lambda expression:");

        MyFunction faculty = (int i) -> {
            int result = 1;
            for (int j = i; j > 0; j--) {
                result *= j;
            }
            return result;
        };



    }


}