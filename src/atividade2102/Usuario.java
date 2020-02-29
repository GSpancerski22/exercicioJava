/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Usuario {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
          
    int decissao;
        Pagamento p = new Pagamento();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    do {
        System.out.print("1 - Para Cadastra");
        System.out.print(" 2 - Para Efetuar Pagamento");
        System.out.println(" 3 - Logout");
        decissao = sc.nextInt();
        
        switch (decissao){
            case 1 :
                funcionarios.add(0,new Funcionario("Jailson Mendes da Silva", 33, "gerente"));
                funcionarios.add(1,new Funcionario("Jailson Mendes", 33, "gerente"));
                
                System.out.println("Funcionário " + funcionarios.get(0).getNome() +" cadastrado com sucesso !");
//                funcionarios.forEach( e -> {
//                    System.out.println(
//                    e.getCargo() + " - " +
//                    e.getIdade() + " - " +
//                    e.getNome()
//                    );
//                });

            break;
            case 2: 
                if (decissao == 1){
                    System.out.println("Efetuar pagamento");
                    p.folhaDePagamento(2000);
                }else if (decissao == 2){
                    System.out.println("");
                }else if(decissao == 3) {
                    System.out.println("saf");
                }
                
                break;
            case 3: 
                System.out.println("logout");
                break;
        }
            
            
        
    }while (decissao ==  1 || decissao == 2);
    
    }
}

  