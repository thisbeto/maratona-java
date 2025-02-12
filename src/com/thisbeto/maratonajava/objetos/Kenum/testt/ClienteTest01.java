package com.thisbeto.maratonajava.objetos.Kenum.testt;

import com.thisbeto.maratonajava.objetos.Kenum.dominio.Cliente;
import com.thisbeto.maratonajava.objetos.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Sasuke", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Naruto",TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Sasuke",TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Naruto",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
