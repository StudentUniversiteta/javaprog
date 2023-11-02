package ru.mirea.lab3_Math_Random.p2.one;

//5. Преобразовать литерал типа double к строке: String d =
//Double.toString(3.14);
public class Wrapper {
    public static void main(String[] args) {
        // cоздайте объекты класса Double, используя методы valueOf().
        Double d1 = Double.valueOf(3.14 );
        Double d2 = Double.valueOf("3.14");
        //Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        double d3 = Double.parseDouble("3.14");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        // Преобразовать объект класса Double ко всем примитивным типам
        byte b = d1.byteValue(); // 8 bit
        short s = d1.shortValue(); // 16 bit
        int i = d1.intValue(); // 32 bit
        long l = d1.longValue(); // 64 bit
        float f = d1.floatValue(); // 32 bit
        double d = d1.doubleValue(); // 64 bit
        // Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        String st = Double.toString(3.14);
        System.out.println("d = " + st);
    }
}