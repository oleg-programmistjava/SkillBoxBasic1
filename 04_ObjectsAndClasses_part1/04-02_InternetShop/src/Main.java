public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("Молоко", 40);
        basket.add("Хлеб",40, 2, 0.5);

        basket.print("Тестовая корзина");
    }
}
