package com.thisbeto.maratonajava.objetos.Tresourcebundle.testt;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        /* Se o locale do usuário for new Locale("fr", "CA")
        e o locale padrão do sistema for pt-BR, o Java buscará:

        messages_fr_CA.properties
        messages_fr.properties
        messages_pt_BR.properties (porque o sistema é pt-BR)
        messages_pt.properties
        messages.properties (fallback final)
      */
    }
}
