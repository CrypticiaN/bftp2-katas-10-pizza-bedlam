public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        boolean quit = false;

        while (!quit) {
            pizza.printInfoMessage();

            pizza.readCommand();

            if (pizza.isQuit()) {
                quit = true;
            }

        }
    }
}
