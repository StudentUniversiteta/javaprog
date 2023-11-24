package ru.mirea.lab24_Gluposti.n2;

class VictorianChair implements Chair{
    @Override
    public void sitOn()
    {
        System.out.println("Сел на стул викторианской эпохи");
    }
}
class MultifunctionalChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сел на многофункциональный стул");
    }
}
class MagicChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сел на волшебный стул");
    }
}
class VictorianChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new VictorianChair();
    }
}

// Реализация Фабрики Многофункциональных стульев
class MultifunctionalChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MultifunctionalChair();
    }
}

// Реализация Фабрики Магических стульев
class MagicChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MagicChair();
    }
}

class Client
{
    void Sit(Chair chair)
    {
        chair.sitOn();
    }
}