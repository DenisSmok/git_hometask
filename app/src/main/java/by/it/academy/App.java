/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package by.it.academy;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Calculator calculator=new Calculator();
        System.out.println(calculator.multiply(3,4));
    }

    public class Calculator{
        private int a;
        private int b;

      public int multiply(int a,int b){
          return a*b;
        }
        public int sumstract(int a, int b){
          return a-b;
        }

    }

}
