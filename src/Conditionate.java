import java.util.function.Predicate;

public interface Conditionate extends MyFunction {

    // "************ exercise 5d ************"

    default Conditionate conditionateInput(Predicate<Integer> predicate) {
        return (int i) -> {

            if (predicate.test(i)) {
                return apply(i);
            } else {
                return 0;
            }
        };
    }


    default Conditionate conditionateOutput(Predicate<Integer> predicate2) {

        return (int i) -> {

            if (predicate2.test(apply(i))) {

                return apply(i);
            } else {

                return 0;
            }

        };

    }


}

