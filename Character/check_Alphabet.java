// check the chararacter is alphabet or not
public class check_Alphabet {
    public static void main(String[] args) {

        char x = '-';


        /*
         Asci value
        A---> 65, B--->66 ,C--->67.......Z--->90
        a---> 97  b---->98 c--->99  ...  z--->122
        */





        /*
// method --1
        if (x >= 65 && x <= 90) {
            System.out.println("upper case");
        }

        else if (x >= 97 && x <= 122) {
            System.out.println("lower case");
        }
        else {
            System.out.println("not a alphabet");
        }
*/



        /*
// method 2
        if (x>='A' && x<='Z') {
            System.out.println("upper case");
        } else if (x >= 'a' && x <= 'z') {
            System.out.println("lower case");
        } else {
            System.out.println("not an alphabet");
        }
*/



     /*
        // method 3-- using java inbuilt method

        if (Character.isAlphabetic(x)) {
            System.out.println("it is Alphabet");
        } else {
            System.out.println("it is not Alphabet");
        }
*/





     /*
//        using ternary operator

        System.out.println(Character.isAlphabetic(x)?"it is alphabet":"it is not a alphabet");
*/




    }
}
