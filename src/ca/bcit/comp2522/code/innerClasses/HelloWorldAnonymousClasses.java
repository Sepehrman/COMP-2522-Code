package ca.bcit.comp2522.code.innerClasses;

/**
 * Let's see how to create and use anonymous classes.
 *
 * @author BCIT
 * @version 2020
 */
public class HelloWorldAnonymousClasses {

    /**
     * This class contains a nested private interface. The interface can be used
     * inside the class to formalize
     */
    private interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    /**
     * Says hello in many fun ways.
     */
    public void sayHello() {

        /* An anonymous class is defined and assigned to a variable.
           It is an implementation of the HelloWorld interface. */
        class EnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(final String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        /* An anonymous class is defined and assigned to a variable.
           It is an implementation of the HelloWorld interface. */
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(final String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        /* An anonymous class is defined and assigned to a variable.
           It is an implementation of the HelloWorld interface. */
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(final String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }



    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
