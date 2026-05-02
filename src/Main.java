public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Пример 1: рост 1.87 м, вес 98 кг
        double height1 = 1.87;
        int weight1 = 98;
        int bmi1 = service.calculate(height1, weight1);
        System.out.println("Рост: " + height1 + " м, Вес: " + weight1 + " кг");
        System.out.println("Индекс массы тела: " + bmi1);
        System.out.println("Ожидаемый результат: 28");
        System.out.println("Проверка: " + (bmi1 == 28 ? "✓ Верно" : "✗ Ошибка"));
        System.out.println();

        // Пример 2: рост 1.75 м, вес 70 кг
        double height2 = 1.75;
        int weight2 = 70;
        int bmi2 = service.calculate(height2, weight2);
        System.out.println("Рост: " + height2 + " м, Вес: " + weight2 + " кг");
        System.out.println("Индекс массы тела: " + bmi2);
        System.out.println("Ожидаемый результат: 22");
        System.out.println("Проверка: " + (bmi2 == 22 ? "✓ Верно" : "✗ Ошибка"));
        System.out.println();

        // Пример 3: рост 1.60 м, вес 52 кг
        double height3 = 1.60;
        int weight3 = 52;
        int bmi3 = service.calculate(height3, weight3);
        System.out.println("Рост: " + height3 + " м, Вес: " + weight3 + " кг");
        System.out.println("Индекс массы тела: " + bmi3);
        System.out.println("Ожидаемый результат: 20");
        System.out.println("Проверка: " + (bmi3 == 20 ? "✓ Верно" : "✗ Ошибка"));
    }
}