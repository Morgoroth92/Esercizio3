package org.example;
/*
Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
 */
public class Main {
    public static void main(String[] args) {
        division(5);
    }
    public static void division(int number) {
        try {
            int result = number / 0;
        } catch (ArithmeticException e) {
            System.out.println("the division by zero is not possible and shows this error: " + e);
        }
    }

}