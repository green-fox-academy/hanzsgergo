package Functions;

public class Greeting {
  public static void main(String[] args) {
    //  From now on, create the usual class wrapper
    //  and main method on your own

    // - Create a string variable named `al` and assign the value `Green Fox` to it
    String al = "Green Fox";
    // - Create a function called `greet()` that greets it's input parameter
    //     - Greeting is printing e.g. `Greetings dear Green Fox`
    // - Greet `al`
    Greet(al);
  }

  public static void Greet(String name) {
    System.out.println("Greeting dear " + name);
  }

}
