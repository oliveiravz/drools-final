package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;

public class DroolsApplication 
{
    public static void main(String[] args) {

        KieServices  ks         = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession   kSession   = kContainer.newKieSession("session");

        List<Fornecedor> fornecedorList = FornecedorRepository.getFornecedores();

        if (fornecedorList == null || fornecedorList.isEmpty()) {
            System.out.println("A lista de fornecedores está vazia ou não foi inicializada.");
        } else {
            System.out.println("Total de fornecedores na lista: " + fornecedorList.size());

            fornecedorList.forEach(fornecedor -> {

                System.out.println("Analisando Fornecedor:" + fornecedor.getNome());
                kSession.insert(fornecedor);
            });
        }

        kSession.fireAllRules();
    }    
}
