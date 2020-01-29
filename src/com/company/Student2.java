package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Student2 implements  Student {
    public String name2 ="ahmad";
    public String salvorod2 ="1396";
    public String vahed2 ="50";
    public Double avg2 = 12.81;

    @Override
    public  void  avg (){
        System.out.println("avrage:"+avg2);
    }
    //////////////////
    @Override
    public  void  vahed() {
        System.out.println("vahed:"+vahed2);
    }
    //////////////////
    @Override
    public  void  salvovoud(){
        System.out.println("salvorod:"+salvorod2);
    }
    //////////////////
    @Override
    public  void  mashroti() throws MashrootEXP{
        if(avg2 <= 10){
            throw  new MashrootEXP("mashroot !");
        }
    }

}
