/*sspeirs
 * 10/3/2020, 11:29 AM */

public class MethodsClass {
        private int grade1;
        private int grade2;

    public MethodsClass(){
            grade1 = 0;
            grade2 = 0;
        }
    public MethodsClass(int g1, int g2){
            grade1 = g1;
            grade2 = g2;
        }
        public static void gradeCalc(int g1, int g2) {

            int total = 0;
            int average = 0;
            total = g1 + g2;
            average = total/2;
            System.out.println("The average grade is:  " + average);
        }
        public void setGr1(int x){

            grade1 = x;
        }
        public void setGr2(int y){

            grade2 = y;
        }
        public int getGr1(){

            return grade1;
        }
        public int getGr2(){

            return grade2;
        }

        public static String greeting(){
            String greeting = "Hello";
            return greeting;
        }
        public static void greetingAgain(){

            System.out.println("Hello");
        }
    }
