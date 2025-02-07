package com.thisbeto.maratonajava.objetos.Hheranca.testt;

import com.thisbeto.maratonajava.objetos.Hheranca.dominio.Endereco;
import com.thisbeto.maratonajava.objetos.Hheranca.dominio.Funcionario;
import com.thisbeto.maratonajava.objetos.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-678");
        Pessoa pessoa = new Pessoa("Xis BETO");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("A.G");
        funcionario.setCpf("2222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------");
        funcionario.imprime();
    }
}
