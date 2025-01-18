
//Create PalindromeChecker  class
class PalindromeChecker {

   //Attributes
   String text;

   //Constructor
   PalindromeChecker(String text) {
       this.text = text;

   }

   //Method to check pallindrome
   public boolean pallindromeCheck() {
       boolean isPallindrome = true;
       int left = 0;
       int right = text.length() - 1;
       while (left <= right) {
           if (text.charAt(left) != text.charAt(right)) {
               isPallindrome = false;
               break;
           }
           left++;
           right--;
       }
       return isPallindrome;
   }

   //Method to display result
   public void displayPallindrome() {
       System.out.println(pallindromeCheck());
   }
}
public class Palindrome
      {
          public static void main(String[] args) {

           // Create Palindrome object
              PalindromeChecker  p1 = new PalindromeChecker ("racecar");
            
              // Display the item details
             p1.displayPallindrome();

          }

      }