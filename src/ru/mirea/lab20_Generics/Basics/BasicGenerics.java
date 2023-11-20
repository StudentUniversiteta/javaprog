package ru.mirea.lab20_Generics.Basics;

public class BasicGenerics<T>
{
    /*
    В этом примере <T> является параметром типа,
    который может быть заменен на конкретный тип данных
    при создании экземпляра класса.
    */
    private T item;
    public void add(T item) {
        this.item = item;
    }
    public T get()
    {
        return item;
    }
    /*
    Дженерики можно использовать для создания обобщённых методов.
    Ниже создаётся обобщенный метод compare для сравнения двух объектов/
     */
    public <T extends Comparable<T>> int compare(T obj1, T obj2)
    {
        /*
        extends Comparable<T> - ограничение типа (type bound).
        Показывает, что тип <T> должен быть подтипом или реализовывать
        интерфейс Comparable<T>
         */
        return obj1.compareTo(obj2);
    }
    //Создаём экземпляр BasicGenerics для целочисленных значений в Testing
}


