/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String hello = "Hello " + args[0] + " and " + args[1] + ".";
        String goodbye = "Goodbye " + args[1] + " and " + args[0] + ".";
        System.out.println(hello);
        System.out.println(goodbye);
    }
}
