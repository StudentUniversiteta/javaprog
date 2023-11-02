package ru.mirea.lab8_Recursion.n7;

import java.util.ArrayList;
import java.util.List;

public class factorisation {

    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        getPrimeFactorsRecursive(n, 2, factors);
        return factors;
    }

    private static void getPrimeFactorsRecursive(int n, int divisor, List<Integer> factors) {
        if (n < divisor) {
            return;
        }

        if (n % divisor == 0) {
            factors.add(divisor);
            getPrimeFactorsRecursive(n / divisor, divisor, factors);
        } else {
            getPrimeFactorsRecursive(n, divisor + 1, factors);
        }
    }

    public static void main(String[] args) {
        int n = 120;
        List<Integer> primeFactors = getPrimeFactors(n);
        System.out.println("Prime factors of " + n + ": " + primeFactors.toString());
    }
}