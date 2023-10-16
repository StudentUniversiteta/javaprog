package ru.mirea.lab7.n4;

import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable
{
    double x;
    int n;
    int nIm;
    MathFunc(double x)
    {
        this.x = x;
    }
    public class complexNum
    {
        private double nRe;
        private double nIm;
        public complexNum(double nRe, double nIm)
        {
            this.nRe = nRe;
            this.nIm = nIm;
        }

        public double getnRe() {
            return nRe;
        }
        public double getnIm(){
            return nIm;
        }
    }
    public void exponentiation(int n)
    {
        double expX = Math.pow(x, n);
        System.out.println("Число " + x + " в степени " + n + "равно: " + expX);
    }

    public void complexModule(double nIm)
    {
        complexNum cNumber = new complexNum(x, nIm);
        System.out.println("Модуль комплексного числа равен: "+(sqrt((cNumber.getnRe()*cNumber.getnRe()) + cNumber.getnIm()*cNumber.getnIm())));
    }
}
