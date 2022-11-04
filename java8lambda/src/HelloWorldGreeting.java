public class HelloWorldGreeting {
    public class helloWorldGreeting implements Greeting {
        @Override
        public void perform() {
            System.out.println("HelloWorld");
        }
    }
}
