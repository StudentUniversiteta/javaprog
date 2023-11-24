package ru.mirea.lab24_Gluposti.n2;

public class Main
{
    public static void main(String[] args)
    {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        Client client = new Client();
        Chair victorianChair = victorianChairFactory.createChair();
        client.Sit(victorianChair);

        Chair multifunctionalChair = multifunctionalChairFactory.createChair();
        client.Sit(multifunctionalChair);

        Chair magicChair = magicChairFactory.createChair();
        client.Sit(magicChair);
    }
}
