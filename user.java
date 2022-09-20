/* Creating an user object.
   The constructor initialize the nameOfUser field. 
   Then displays the value on the screen and underlines it with dashes. */

public class User {
    public User(String name) {
  String nameOfUser = name;
  System.out.println("\n" + nameOfUser);
  System.out.println("---------------------------");
    }

    public static void main(String args[]) {
        new User("Day");
    }
}
