public class BmiService {
    public int calculate(double heightMeters, int weightKg) {
        // Формула ИМТ: вес (кг) / (рост (м) * рост (м))
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi; // Преобразуем дробное число в целое
    }
}