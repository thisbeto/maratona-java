package com.thisbeto.maratonajava.introducao.Aula05;

public class Aula05_ExercicioSalario {
    public static void main(String[] args) {
        double salary = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        if (salary <= 34712) {
            valorImposto = primeiraFaixa * salary;
        }
        else if (salary > 34712 && salary <= 68507) {
            valorImposto = segundaFaixa * salary;
        } else {
            valorImposto = terceiraFaixa * salary;
        }
        double newSalary = salary - valorImposto;
        System.out.println("VALOR DO IMPOSTO :"+valorImposto+"| NOVO SALÁRIO: "+newSalary);
    }
}
