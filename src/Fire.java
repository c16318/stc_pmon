/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */

public class Fire extends Water {
    
    public Fire(String name, String type,int life,int level,int experience){ super(name,type,life,level,experience);};
    
    @Override public int attack(){
        System.out.println("ほのお");
        return 100;
    }
}
