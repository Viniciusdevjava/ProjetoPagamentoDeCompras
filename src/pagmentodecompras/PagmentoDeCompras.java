/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagmentodecompras;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class PagmentoDeCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double vlrCompra;
        int escolha;
        do{
            System.out.println("Digite o valor das suas compras:");
            vlrCompra = s.nextDouble();
            System.out.println("Informe a forma de pagamento:");
            System.out.println("1 Dinheiro");
            System.out.println("2 Cartão");
            System.out.println("3 2x (1+1)");
            System.out.println("4 2x (0+2)");
            escolha=s.nextInt();
            switch(escolha){
                case 1: System.out.println("A pagar: R$ " + vlrCompra*0.85);
                break;
                case 2: System.out.println("A pagar: R$ " + vlrCompra*0.95);
                break;
                case 3: System.out.println("A pagar: R$ " + vlrCompra);
                break;
                case 4: System.out.println("A pagar: R$ " + vlrCompra*1.10);
                break;
                default: System.out.println("Opção invalida!");
            }
            
            System.out.println("OUTRA FORMA!!!");
            
            if(escolha==1){
                System.out.println("A pagar: R$ " + vlrCompra*0.85);
            }else{
                if(escolha==2){
                    System.out.println("A pagar: R$ " + vlrCompra*0.95);
                }else{
                    if(escolha==3){
                        System.out.println("A pagar: R$ " + vlrCompra);
                    }else if(escolha==4){
                        System.out.println("A pagar: R$ " + vlrCompra*1.10);
                    }else{
                        System.out.println("Opção invalida!");
                    }
                }
            }
        }while(escolha>=1);
}
}