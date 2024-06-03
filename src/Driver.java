public class Driver  {

    public void applyAndPrint(MyFunction givenFunction, int x, int y) {

        for (int i = x; i <= y; i++) {
            System.out.println(givenFunction.apply(i));
        }

    }



}
