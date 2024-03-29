public class Module5 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
                sayHello();
                sayHello("John");
                boolean condition = true;
                boolean condition2 = false;
                if (condition) {
                    // code to execute if condition is true
                } else if (condition2) {
                    // code to execute if condition2 is true
                } else {
                    System.out.println("Something Nice");// code to execute if none of the conditions are true
            
                }
            }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}