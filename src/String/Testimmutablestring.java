package String;
public class Testimmutablestring{
 public static void main(String args[]){
   String s="Indonesia";
   String idr = s.concat(" Raya");//concat() method appends the string at the end
   System.out.println(s);//will print Sachin because strings are immutable objects
   System.out.println(idr);
 }
}
