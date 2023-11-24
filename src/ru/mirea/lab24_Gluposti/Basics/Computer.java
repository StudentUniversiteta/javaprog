package ru.mirea.lab24_Gluposti.Basics;


/*
Есть значится шаблоны проектирования
Порождающие, структурные, поведенческие
Есть еще какие-то, типа MVC, но мне похуй

У автора документа стояк на шаблон factory, фабричный метод
Используется когда есть суперкласс с несколькими подклассами, и
один из подклассов нужно вернуть на основе ввода. Я не знаю че такое
суперкласс.
СУПЕРКЛАСС
это интерфейс/абстрактный класс/обычный класс жава
Ниже будет пример такового с переопределенным методом
toString потому что потому
 */
public abstract class Computer
{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    @Override
    public String toString()
    {
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+
                ", CPU="+this.getCPU();
    }
}



