/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */

public class Water {
    
    private String name;
    private String type;
    private int life;
    private int level;
    private int experience;
    
    public Water(String name, String type,int life,int level,int experience){
        this.name = name;
        this.type = type;
        this.life = life; 
        this.level = level;
        this.experience = experience; 
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public int getLife(){
        return life;
    }
    
    public int getLevel(){
        return level;
    }
    
    public int getExperience(){
        return experience;
    }
    
    
    public int attack(){          //攻撃時のダメージの値を返す
        System.out.println("みずでっぽう");
        return 100;
    }
    
    public void beHurt(int x){       //引数の値をlifeから引く
        life -= x;
    }
    
    
}