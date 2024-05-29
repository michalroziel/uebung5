public class Main {
    public static void main(String[] args) {

        Driver myDriver = new Driver();

        MyFunction f = new MyFunction() {
            public int apply(int i) {
                return i + 1;
            }
        };

        System.out.println(myDriver.apply(f, 5));

    }



}