//import java.util.*;
class CmdlineArg{

   public static void main(String[] args){

  Integer a =Integer.parseInt(args[0]);

  System.out.println("Converted"+a.getClass().getName());
  System.out.println("argument"+args[0].getClass().getName());	
  System.out.println("Hello "+ args[0]+" welcome to Hackers Heaven");


}}
