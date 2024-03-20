class ConsoleInput {
    public void inputData(Order order) {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQuantity(readInt("Quantity: "));
        order.setPrice(readInt("Price: "));
    }

    private String prompt(String message) {
        System.out.print(message);
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    private int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Некорректный ввод. Введите число.");
            }
        }
    }
}