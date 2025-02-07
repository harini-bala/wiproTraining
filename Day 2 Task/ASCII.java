import java.sql.SQLOutput;
//DAY 2 Evening
public class Demo {

        public static void main(String[] args) {

            //ASCII
            ascii();

            //integer
            int result1 = calc(1, 2);
            System.out.println("Method with integer return type, Output is "+ result1);

            //double
            double result2 = divider(3.63456, 2.56563);
            System.out.println("Method with double return type, Output is "+ result2);

            //float
            float result3 = div(7.676f, 4.246f);
            System.out.println("Method with float return type, Output is "+ result3);

            //character
            char ch = character(103, 6);
            System.out.println("Method with character return type, Output is "+ ch);

            //boolean
            System.out.println("Method with boolean return type, Output is ");
            System.out.print(isEqual(6, 5));

            //string
            System.out.println("Method with boolean return type, Output is ");
            System.out.println(greet("Sri"));

        }

        private static void ascii() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch + " -> " + (int) ch);
            }
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch + " -> " + (int) ch);
            }
        }

        private static int calc(int a, int b){
            return a+b;
        }

        private static double divider(double a, double b){
            return a/b;
        }

        private static float div(float  a, float b){
        return (float) (a/b);
         }

        private static char character(int a, int b){
            return (char)(a+b);
        }

        private static boolean isEqual(int a, int b) {
            return a == b;
        }

        private static String greet(String a){
           return("Hi! "+ a);
        }


}
