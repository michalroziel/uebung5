public class Driver implements MyFunction {

    public  int apply(MyFunction f, int i) {
        return f.apply(i);
    }


    @Override
    public int apply(int i) {
        return 0;
    }
}
