/* Creating an user object.
   The constructor initialize the nameOfUser field. 
   Then displays the value on the screen and underlines it with dashes. */

public class User {
   // Constructor
   public User(String name) {
      String nameOfUser = name;
      System.out.println("\n" + nameOfUser);
      System.out.println("---------------------------");
    }
   
   // Overloading constructor
   public User(String firstName, String lastName) {
      nameOfUser = firstName + " " + lastName;
      System.out.println("\n" + nameOfUser);
      System.out.println ("---------------------------");
   }
   
   public static void main(String args[]) {
      // Using the first constructor to instantiate user1 object.
      User user1 = new User("Day");
   }
}
