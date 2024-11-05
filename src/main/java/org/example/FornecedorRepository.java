package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FornecedorRepository 
{
    
    public static List<Fornecedor> getFornecedores()
    {

        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Marilan");
        fornecedor1.setFrete(60);
        fornecedor1.setCondicaoPgto("A vista");
        fornecedor1.setPreco(1000.00);
        fornecedor1.setReputacao(5);

        Fornecedor fornecedor2 = new Fornecedor();
        fornecedor2.setNome("Nestlé");
        fornecedor2.setFrete(120);
        fornecedor2.setCondicaoPgto("Parcelado em 2x");
        fornecedor2.setPreco(1200.00);
        fornecedor2.setReputacao(4);

        // Fornecedor 3
        Fornecedor fornecedor3 = new Fornecedor();
        fornecedor3.setNome("Bel Alimentos");
        fornecedor3.setFrete(90);
        fornecedor3.setCondicaoPgto("Parcelado em 3x");
        fornecedor3.setPreco(950.00);
        fornecedor3.setReputacao(3);

        // Fornecedor 4
        Fornecedor fornecedor4 = new Fornecedor();
        fornecedor4.setNome("Dori Alimentos");
        fornecedor4.setFrete(30);
        fornecedor4.setCondicaoPgto("À vista com desconto");
        fornecedor4.setPreco(1100.00);
        fornecedor4.setReputacao(4);

        // Fornecedor 5
        Fornecedor fornecedor5 = new Fornecedor();
        fornecedor5.setNome("Kuky");
        fornecedor5.setFrete(60);
        fornecedor5.setCondicaoPgto("Parcelado em 4x");
        fornecedor5.setPreco(980.00);
        fornecedor5.setReputacao(3);
    
        return new ArrayList<>(Arrays.asList(fornecedor1, fornecedor2, fornecedor3, fornecedor4, fornecedor5));


    }
}
