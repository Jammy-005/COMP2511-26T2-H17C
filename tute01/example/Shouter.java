package example;

/**
 * Inside a new file Shouter.java, write a program that stores a message and 
 * has methods for getting the message, updating the message and printing it out 
 * in all caps. Write a main() method for testing this class.
 */
public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("Hello World");
        System.out.println(shouter.getMessage());
        shouter.shout();
        shouter.setMessage("Goodbye World");
        System.out.println(shouter.getMessage());
    }
}
