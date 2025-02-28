package com.thisbeto.maratonajava.objetos.Sformatacao.testt;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+ " ");
        }
        System.out.println();
        for (String isoCountrie : isoCountries) {
            System.out.print(isoCountrie+ " ");
        }
    }
}
