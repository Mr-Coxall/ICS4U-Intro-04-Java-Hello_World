/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-09-01
*/
final class HelloWorld {
  private HelloWorld() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
    throw new IllegalStateException("Cannot be instantiated");
  }
  /**
  * This method prints out "Hello, World!".
  * @param args qwerty
  */
  public static void main(final String[] args) {
    System.out.println("Hello, World!");
    System.out.println("\nDone.");
  }
}
