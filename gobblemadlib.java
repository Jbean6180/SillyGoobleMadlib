//TO DO:  import Scanner class
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //TO DO:  Create a Scanner object.
    Scanner myScanner = new Scanner(System.in);
    //TO DO:  Ask the user to enter 10 nouns.  Store the values they enter in an array.
      String[] nounArray;
      nounArray = new String[10];
      System.out.print("Please enter a noun: ");
      nounArray[0] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[1] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[2] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[3] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[4] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[5] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[6] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[7] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[8] = myScanner.nextLine();
      System.out.print("Please enter a noun: ");
      nounArray[9] = myScanner.nextLine();
    //TO DO:  Ask the user to provide 4 adjectives.  Store the values they enter in an array.
      String[] adjectiveArray;
      adjectiveArray = new String[4];
      System.out.print("Please enter an adjective: ");
      adjectiveArray[0] = myScanner.nextLine();
      System.out.print("Please enter an adjective: ");
      adjectiveArray[1] = myScanner.nextLine();
      System.out.print("Please enter an adjective: ");
      adjectiveArray[2] = myScanner.nextLine();
      System.out.print("Please enter an adjectives: ");
      adjectiveArray[3] = myScanner.nextLine();
   //TO DO:  Ask the user to provide the name of a family member.  Store that value in a variable.
      String[] familyMemberArray;
      familyMemberArray = new String[1];
      System.out.print("Please enter the name of a family member: ");
      familyMemberArray[0] = myScanner.nextLine();
    ////Write the necessary code to display the silly story using the values stored in the arrays and variable you created. 
    System.out.print("One of the best parts of Thanksgiving is having pie for dessert.  My favorites are " + (nounArray[5]) + " and " + (nounArray[7]) + " pie, though I know lots of people ");
    System.out.print(" like " + (nounArray[0]) + " pie and even " + (adjectiveArray[0]) + " pie. " + " My " + (familyMemberArray[0]) + " makes their own pie crust using " + (adjectiveArray[0]) + " and ");
    System.out.print((nounArray[1]) + " and it tastes so " + (adjectiveArray[2])+ " . " + (familyMemberArray[0]) + " pies in the " + (nounArray[8]) + " for ");
    System.out.print(" 20 " + " minutes and it comes out smelling " + (adjectiveArray[1]) + " I like to have " + (familyMemberArray[0]) + "" + (nounArray[9]) + " pie with vanilla ");
    System.out.print((nounArray[2]) + " on top or fresh whipped " + (nounArray[3]) + ". ");
    //TO DO:  Write a for loop to display all the elements in the noun array.  
    //Each noun should appear on its own line.
    for (int i = 0; i < 10; i++) {
       
       System.out.println(nounArray[0]);
       System.out.println(nounArray[1]);
       System.out.println(nounArray[2]);
       System.out.println(nounArray[3]);
       System.out.println(nounArray[4]);
       System.out.println(nounArray[5]);
       System.out.println(nounArray[6]);
       System.out.println(nounArray[7]);
       System.out.println(nounArray[8]);
       System.out.println(nounArray[9]);
       nounArray[10] = myScanner.nextLine();
    }
    //TO DO:  Write a foreach loop to display all the elements in the adjective array.  
    //The adjectives should appear on the same line with a space in between each value.
    for (String i : adjectiveArray) {
     System.out.println(i);
    }
    
  }
}
