package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Student1 implements   Student {
    public String name1 ="MARYAM";
    public String salvorod1 ="1397";
    public String vahed1 ="28";
    public Double avg1 = 20.00;

    @Override
    public  void  avg (){
        System.out.println("avrage:"+avg1);
    }

    @Override
    public  void  vahed() {
        System.out.println("vahed:"+vahed1);
    }

    @Override
    public  void  salvovoud(){
        System.out.println("salvorod:"+salvorod1);
    }

    @Override
    public  void  mashroti() throws MashrootEXP{
        if(avg1 <= 10){
            throw  new MashrootEXP("mashroot shodiiiiii !");
        }
    }

}