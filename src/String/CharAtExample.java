package String;

public class CharAtExample{
  public static void main(String args[]){
  String name="Indonesia Raya";
  char ch=name.charAt(4);//returns the char value at the 4th index
  System.out.println(ch); // o
  // The last Character is present at the string length-1 index
  System.out.println("Character at last index is: "+ name.charAt(name.length()-1));  // a
  }
}
