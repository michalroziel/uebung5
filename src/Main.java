import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Driver myDriver = new Driver();
        // This is the lambda expression

        MyFunction printFun = (i) -> i;

        myDriver.applyAndPrint(printFun, 1, 5);


        System.out.println("************ exercise b ************");

        System.out.println("exercise 5b1 using lambda expression:");


        myDriver.applyAndPrint((i) -> i * i, 2, 5);


        System.out.println("exercise 5b1 using anonymous class:");
        MyFunction obj = new MyFunction() {
            @Override
            public int apply(int i) {
                return i * i;
            }
        };

        myDriver.applyAndPrint(obj, 2, 5);


        System.out.println("************ ******* ************");

        System.out.println("exercise 5b2 using lambda expression:");

        MyFunction faculty = (int i) -> {
            int result = 1;
            for (int j = i; j > 0; j--) {
                result *= j;
            }
            return result;
        };

        myDriver.applyAndPrint(faculty, 2, 5);


        System.out.println("exercise 5b2 using anonymous class:");

        MyFunction anonFac = new MyFunction() {

            @Override
            public int apply(int i) {

                int result = 1;
                for (int j = i; j > 0; j--) {
                    result *= j;
                }
                return result;


            }
        };

        myDriver.applyAndPrint(anonFac, 2, 5);

        System.out.println("exercise 5b2 using TopLevel class:");

        Faculty myFac = new Faculty();
        System.out.println(myFac.computeFaculty(2)); // 2
        System.out.println(myFac.computeFaculty(3)); // 6
        System.out.println(myFac.computeFaculty(4)); // 24
        System.out.println(myFac.computeFaculty(5)); // 120

        System.out.println("exercise 5b2 using inner class:");

        Faculty.FacultyInside innerFac = new Faculty().new FacultyInside();

        System.out.println(innerFac.facultyComputer(2)); // 2
        System.out.println(innerFac.facultyComputer(3)); // 6
        System.out.println(innerFac.facultyComputer(4)); // 24
        System.out.println(innerFac.facultyComputer(5)); // 120

        System.out.println("exercise 5b3 using anonymous  class:");

        MyFunction anonPow = new MyFunction() {
            @Override
            public int apply(int i) {

                return (int) Math.pow(i, i + 1);

            }
        };

        myDriver.applyAndPrint(anonPow, 2, 5);

        System.out.println("exercise 5b3 using lambda expression:");

        myDriver.applyAndPrint((i) -> (int) Math.pow(i, i + 1), 2, 5);

        System.out.println("exercise 5b4 using anonymous class:");

        MyFunction anonFib = new MyFunction() {
            @Override
            public int apply(int i) {

                int finalresult = 0;

                if (i == 0) {
                    return 0;

                } else if (i == 1) {

                    return 1;

                } else {
                    finalresult += apply(i - 1) + apply(i - 2);
                }

                return finalresult;

            }
        };

        myDriver.applyAndPrint(anonFib, 0, 5);

        System.out.println("exercise 5b4 using lambda expression:");

        myDriver.applyAndPrint((i) -> {

            if (i == 0) return 0;
            if (i == 1) return 1;


            int firstTerm = 0;
            int secondTerm = 1;


            for (int j = 2; j <= i; j++) {

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;


            }

            return secondTerm;


        }, 0, 5);

        System.out.println("************ exercise 5d ************");

        Predicate<Integer> odd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 == 0) {
                    return false;
                } else {
                    return true;

                }

            }
        };

        Predicate<Integer> even = (i) -> i % 2 == 0;


        System.out.println("************ exercise 5e ************");

        Conditionate myCondiPow = (int i) -> (i * i);

        myDriver.applyAndPrint(myCondiPow.conditionateInput(even), 1, 20);

        System.out.println("************ exercise 5f ************");


        Conditionate myCondiFac = (i) -> {
            int result = 1;
            for (int j = i; j > 0; j--) {
                result *= j;
            }
            return result;
        };

        myDriver.applyAndPrint(x -> myCondiFac.conditionateInput(odd).apply(x), 1, 20);

    }


}