public class Main {
    public static void main(String args[]) {
        printodd(15);
        System.out.println("______________________________");
        printodd(14);
    }

    static int printodd(int input) {
        if (input == 1) {
            System.out.println(input);
            return 0;
        }
        if (input % 2 != 0) {
            System.out.println(input);
            printodd(input - 2);
        }
        if(input%2==0) {

            printodd(input - 1);
        }
        return 1;
    }
}
//in recursion function first give the base condition and thn the function.