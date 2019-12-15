
package third_question;
import java.util.*;
public class Third_question {

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
     boolean capital_letter = true;
     
     if((s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') && (s.charAt(1)>= 'A' && s.charAt(1) <= 'Z')){
         
         //In here,if your first two digits are not a capital letter,program will close.
         //We use it after 16 digit control.
         
         capital_letter = true;
     }else{
         capital_letter = false;
     }
             
     if(s.length()!=16){
         
        //In here,if your number which is your entered,doesn't 16 digits,program will close.
         
         System.out.println("You enter an invalid number.You have to enter a 16 digits.");
         System.exit(0);
     }else{    
         
         //In here,if your ID number is 16 digits,program will be continued.
         
     if((s.charAt(0) >= s.charAt(1))){
          
         //In here,if your first letter bigger than second letter,program will close.
         
        System.out.println("You enter an invalid number.(Error:2)");
        firsttwocharacter = false;
        System.exit(0);
     }else if(capital_letter == false){
         
         //In here,if your first two digits are not a capital letter,program will close.
         
         System.out.println("You enter an invalid number.(Error:4)");
        firsttwocharacter = false;
        System.exit(0);
     }
     
     else if((s.charAt(0) < s.charAt(1))){
         
          //In here,if your second letter bigger than first letter,program will be continued.
         
         firsttwocharacter = true;
     }
    }       
     if(firsttwocharacter){
         
         //In here,if your ID number passed the first two digits check,this process will be check the after two digits are prime or not prime.

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
            
            //In here,if your ID number passed the prime check,this algorithm will be the double every second digit from right to left. 
           
            
           char p = s.charAt(i);
           smallerthanzero = ((c.length()+p-48)*2) < 10; 
           
           //This algorithm((c.length()+p-48)) makes the ASCII number to integer number.
           //In here ,if doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
           
            if(smallerthanzero == false || smallerthanzero == true){
           int output = (((c.length()+p)-48)*2);
           int divider0 = output%10;
           int divider1 = output/10;
         
           int sum0 = divider0+divider1;
               //System.out.println(divider0+"+"+divider1+"="+(divider0+divider1));
               //In here,this process aum up the doubling digits.
           sum = sum + divider0 + divider1;
              // System.out.println("SUM1: "+sum);
               summary = sum +sum2;
                }
        }
      
       for(int j = s.length()-1;j >= 5;j -= 2){
           
           //In here,we are adding all digits in the odd places from right to left in the card number.
           
           char o = s.charAt(j);
           int output = (((c.length()+o)-48));
           //System.out.print(output+" ");
            sum2 += output;
            }
            //System.out.println("SUM2: "+sum2);
            summary = sum + sum2;
            //System.out.println(summary);}
    if((sum + sum2)%10 == 0){
        
            //In here,sum the results from doubling step and adding odd places step.
            //Then,if our sum divisible by 10, the account number is valid.
            // Otherwise, it is invalid.
        
                System.out.println("The account number "+s+" is valid.");
                }
            else{
                 System.out.println("The account number "+s+" is invalid.");
            }
        }
 }
}
 
