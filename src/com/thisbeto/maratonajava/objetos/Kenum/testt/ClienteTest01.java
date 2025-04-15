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
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        // Aqui se deixar diferente ele vai dar errado porque o valueOf retorna no nome
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa   Física");
        // Estamos devolvendo "Pessoa física" que é um atributo e ele vai nos devolver o nome do objeto, que é PESSOA_FISICA
        System.out.println(tipoCliente2);

    }
}
