/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */import java.util.Scanner;

   
public class pokemonTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);       
        Water poke = new Water("ゼニガメ","みず",500,2,3);
        Fire poke2 = new Fire("ヒトカゲ","ほのお",300,3,2);
        
       // System.out.println(i.getName());
       // i.attack();
        
        //System.out.println(i2.getName());
       // i2.attack();
        int m=0;
        do{
            System.out.println("戦う:1/止める:0");
            m = stdIn.nextInt();
            poke2.beHurt(poke.attack());       //ダメージの値をひくメソッドを呼び出し、
                                               //引数に,ダメージの値を返す
                                               //メソッドを呼び出している。
            System.out.println(poke.getName() + "の残りLife:" + poke.getLife());
            System.out.println();
            
            System.out.println(poke2.getName() + "の残りLife:" + poke2.getLife());
            System.out.println();
            
            
            
        }while(m != 0 && poke.getLife() > 0 && poke2.getLife() > 0);
        
        if(poke.getLife() <= 0){
            System.out.println(poke2.getName() + ":Win!");
        }
        else{
            System.out.println(poke.getName() + ":Win!");
        }
    }
    
}


