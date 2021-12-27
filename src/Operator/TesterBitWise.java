package Operator;

/*
Signed right shift operator
The signed right shift operator '>>' uses the sign bit to fill the trailing positions. 
For example, if the number is positive then 0 will be used to fill the trailing positions and if the number is negative then 
1 will be used to fill the trailing positions.

Assume if a = 60 and b = -60; now in binary format, they will be as follows −
a = 0000 0000 0000 0000 0000 0000 0011 1100
b = 1111 1111 1111 1111 1111 1111 1100 0100
In Java, negative numbers are stored as 2's complement.
Thus a >> 1 = 0000 0000 0000 0000 0000 0000 0001 1110
And b >> 1 = 1111 1111 1111 1111 1111 1111 1110 0010

Unsigned right shift operator
The unsigned right shift operator '>>' do not use the sign bit to fill the trailing positions. 
It always fills the trailing positions by 0s.

Thus a >>> 1 = 0000 0000 0000 0000 0000 0000 0001 1110
And b >>>  1 = 0111 1111 1111 1111 1111 1111 1110 0010
*/
public class TesterBitWise {
   public static void main(String[] args) {
      int a = 60;          int b = -60;        int c = 0;
      System.out.println("60  = " + Integer.toBinaryString(a));
      System.out.println("-60 = " + Integer.toBinaryString(b));

      //signed shift
      c = a >> 1;              
      System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

      //unsigned shift
      c = a >>> 1;            
      System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );

      c = b >> 1;              
      System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

      c = b >>> 1;            
      System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
   }
}