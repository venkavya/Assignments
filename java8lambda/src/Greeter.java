public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
        public static void main(String[] args) {
        Greeter greeting = new Greeting();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeter.greet(helloWorldGreeting);
        MyLambda lambdagreeting =() -> System.out.println("helloworld");
        }
    }
interface MyLambda {
    void foo();
}
/*interface MyAdd {
int add(int x, int y);
 */