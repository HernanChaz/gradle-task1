/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package productapplication;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Product prod = new Product("TV", "Samsung tv", 1000.00);
        System.out.println("product: " + prod);
    }
}
