class JsonExporter {
    public void exportOrder(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            String json = "{\"clientName\":\"" + order.getClientName() + "\","
                    + "\"product\":\"" + order.getProduct() + "\","
                    + "\"quantity\":" + order.getQuantity() + ","
                    + "\"price\":" + order.getPrice() + "}";
            writer.write(json);
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }
}