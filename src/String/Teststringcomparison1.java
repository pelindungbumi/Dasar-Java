package String;

public class Teststringcomparison1{
 public static void main(String args[]){
   String s1="Indonesia";
   String s2="Indonesia";
   String s3=new String("Indonesia");
   String s4="Raya";
   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s3));
   System.out.println(s1.equals(s4));
 }
}
