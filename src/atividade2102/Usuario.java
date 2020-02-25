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
          
    int sair = 0;
    int decissao;
    //criar uma const 
    do {
        Funcionario f = new Funcionario();
        Pagamento p = new Pagamento();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        System.out.println(" ");
        decissao = sc.nextInt();
        


        
        switch (decissao){
            case 1 :
                f.cadastro("Jaiuson", 33, "Pai de familia");
                funcionarios.add(f);
                
                break;
            case 2: 
                System.out.println("Efetuar pagamento");
                p.folhaDePagamento(1.330);
                
                break;
            case 3: 
                System.out.println("logout");
                break;
        }
            
            
        
    }while (decissao !=  3);
    
    
    }
}
  