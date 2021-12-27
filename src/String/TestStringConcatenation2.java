package String;

public class TestStringConcatenation2{  
 public static void main(String args[]){
   String s=(new StringBuilder()).append("Indonesia").append(" Raya").toString();
   System.out.println(s);//Indonesia Raya
 }
}
