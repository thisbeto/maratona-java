package com.thisbeto.maratonajava.objetos.Kenum.testt;

import com.thisbeto.maratonajava.objetos.Kenum.dominio.Cliente;
import com.thisbeto.maratonajava.objetos.Kenum.dominio.TipoCliente;
import com.thisbeto.maratonajava.objetos.Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Sasuke", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Naruto",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));


    }
}
