
package second;

import java.util.*;

public class Second {

    public static void main(String[] args) {
 Scanner asd = new Scanner(System.in);
        System.out.println("Please enter your id number: ");
        String id = asd.nextLine();
        ID(id);
  
 }public static void ID(String s){
     int summary;
     int sum = 0;
     int sum2=0;
     boolean firsttwocharacter = true;
     boolean prime = true;
     boolean smallerthanzero = true;
     if(s.length()!=16){
         System.out.println("You enter an invalid number.You have to enter a 16 digits.");
         System.exit(0);
     }else{    
     if(s.charAt(0) >= s.charAt(1)){
        System.out.println("You enter an invalid number.(Error:2)");
        firsttwocharacter = false;
        System.exit(0);
     }else if(s.charAt(0) < s.charAt(1)){
         firsttwocharacter = true;
     }
    }       
     if(firsttwocharacter){

   if((s.charAt(2) == '1'&& s.charAt(3) == '1') ||(s.charAt(2) == '1'&& s.charAt(3) == '3') ||(s.charAt(2) == '1'&& s.charAt(3) == '7') 
    ||(s.charAt(2) == '1'&& s.charAt(3) == '9') ||(s.charAt(2) == '2'&& s.charAt(3) == '3') ||(s.charAt(2) == '2'&& s.charAt(3) == '9')
    ||(s.charAt(2) == '3'&& s.charAt(3) == '1') ||(s.charAt(2) == '3'&& s.charAt(3) == '7') ||(s.charAt(2) == '4'&& s.charAt(3) == '1') 
    ||(s.charAt(2) == '4'&& s.charAt(3) == '3') ||(s.charAt(2) == '4'&& s.charAt(3) == '7') ||(s.charAt(2) == '5'&& s.charAt(3) == '3')
    ||(s.charAt(2) == '5'&& s.charAt(3) == '9') ||(s.charAt(2) == '6'&& s.charAt(3) == '1') ||(s.charAt(2) == '6'&& s.charAt(3) == '7')
    ||(s.charAt(2) == '7'&& s.charAt(3) == '1') ||(s.charAt(2) == '7'&& s.charAt(3) == '3') ||(s.charAt(2) == '7'&& s.charAt(3) == '9') 
    ||(s.charAt(2) == '8'&& s.charAt(3) == '3') ||(s.charAt(2) == '8'&& s.charAt(3) == '9') ||(s.charAt(2) == '9'&& s.charAt(3) == '7'))
   {
        prime = true;
   }
   else{
       System.out.println("You enter an invalid number.(Error:3)"); 
       prime = false;
       System.exit(0);
   }
   }
     if(prime){
        String c ="";
        
        for(int i = 4;i < s.length();i += 2){
           char p = s.charAt(i);
           smallerthanzero = ((c.length()+p-48)*2) < 10;   
            if(smallerthanzero == false || smallerthanzero == true){
           int output = (((c.length()+p)-48)*2);
           int divider0 = output%10;
           int divider1 = output/10;
           int allsum = 0;
           int sum0 = divider0+divider1;
               //System.out.println(divider0+"+"+divider1+"="+(divider0+divider1));
           sum = sum + divider0 + divider1;
              // System.out.println("SUM1: "+sum);
               summary = sum +sum2;
                }
        }
      
       for(int j = s.length()-1;j >= 5;j -= 2){
           char o = s.charAt(j);
           int output = (((c.length()+o)-48));
           //System.out.print(output+" ");
            sum2 += output;
            }
            //System.out.println("SUM2: "+sum2);
            summary = sum + sum2;
            //System.out.println(summary);}
    if((sum + sum2)%10 == 0){
                System.out.println("The account number "+s+" is valid.");
                }
            else{
                 System.out.println("The account number "+s+" is invalid.");
            }
        }
 }
}
 
