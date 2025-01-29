package com.thisbeto.maratonajava.introducao.Aula05;

public class Aula05_ExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando Swtich e dado os valores de 1 a 7, imprima se é dia util ou fim de semana
        // Considerando 1 como domingo

        byte dia = 6;
        switch (dia){
            case 1:
                System.out.println("Domingo: Fim de semana");
                break;
            case 2:
                System.out.println("Segunda: Dia Util");
                break;
            case 3:
                System.out.println("Ter: Dia Util");
                break;
            case 4:
                System.out.println("Qua: Dia util");
                break;
            case 5:
                System.out.println("Qui: Dia util");
                break;
            case 6:
                System.out.println("Sex: Dia Util");
                break;
            case 7:
                System.out.println("Sab: Fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Opção mais SIMPLES, levando em conta que o case não para sem o break.
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }

}
