package ru.mirea.lab4.n1;

public class Summer {

    public double avgTemp;

    public enum timesOfYear
    {
        Зима (0),
        Весна (10),
        Лето (20),
        Осень (8)
        ;
        private final double avgTemp;
        private timesOfYear (double avgTemp)
        {
            this.avgTemp = avgTemp;
        }
        public double getAvgTemp()
        {
            return this.avgTemp;
        }
    }

    public timesOfYear myTimeOfYear;
    public static void checker(timesOfYear myTimeOfYear)
    {
        switch(myTimeOfYear)
        {
            case Лето:
                System.out.println("Люблю лето! ");
            case Зима:
                System.out.println("Люблю зиму! ");
            case Осень:
                System.out.println("Люблю осень! ");
            case Весна:
                System.out.println("Люблю весну! ");
        }
    }
    public static void coldTimes(timesOfYear myTimeOfYear)
    {
        switch(myTimeOfYear)
        {
            case Лето:
                System.out.println("Теплое время года ");
            case Зима:
                System.out.println("Холодное время года ");
            case Осень:
                System.out.println("Холодное время года ");
            case Весна:
                System.out.println("Холодное время года ");
        }
    }
    public static void main(String[] args)
    {
        timesOfYear myTimeOfYear = timesOfYear.Весна;
        checker(myTimeOfYear);
        coldTimes(myTimeOfYear);
        System.out.println(myTimeOfYear.getAvgTemp() + " градусов");
    }
}
