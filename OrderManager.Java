public class OrderManager {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order();
        ConsoleInput input = new ConsoleInput();
        input.inputData(order);
        JsonExporter exporter = new JsonExporter();
        exporter.exportOrder(order);
    }
}

class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    // геттеры и сеттеры
}
