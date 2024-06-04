public class Faculty {


    public int computeFaculty(int x) {

        int result = 1;
        for (int j = x; j > 0; j--) {
            result *= j;
        }
        return result;

    }


    class FacultyInside {

        public int facultyComputer(int x) {

            int result = 1;

            for (int j = x; j > 0; j--) {
                result *= j;
            }
            return result;
        }
    }

}

