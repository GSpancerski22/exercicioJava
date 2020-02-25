
package atividade2102;


public class Pagamento {
   public void folhaDePagamento(double salBruto){
       double salDes;
       double des;
     if(salBruto <= 1.751){
         salDes =(salBruto*8)/100; 
     }else if(salBruto <= 2.919){
         
         salDes =(salBruto*9)/100; 
     }else if(salBruto <= 5.839){
         salDes =(salBruto*11)/100; 
         
     }else {
         salDes = salBruto - 652; 
             
     } 
         System.out.println("Seu salario é " + salDes  );
    } 
   public void decimoTerceiro(double salBruto){
       
    }
   public void ferias(double salBruto){
   }
   
}
