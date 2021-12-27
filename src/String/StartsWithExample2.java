package String;

public class StartsWithExample2 {
    public static void main(String[] args) {
        String str = "Indonesia Raya";
        System.out.println(str.startsWith("I")); // True
        System.out.println(str.startsWith("n")); // False
        System.out.println(str.startsWith("n",1)); // True
    }
}
