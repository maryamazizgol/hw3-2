package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Student3 implements Student{
    public String name3 ="MINA";
    public String salvorod3 ="1395";
    public String vahed3 ="14";
    public Double avg3 = 8.1;
    @Override
    public  void  avg (){
        System.out.println("avrage:"+avg3);
    }
    //////////////////
    @Override
    public  void  vahed() {
        System.out.println("vahed:"+vahed3);
    }
    //////////////////
    @Override
    public  void  salvovoud(){
        System.out.println("salvorod:"+salvorod3);
    }
    //////////////////
    @Override
    public  void  mashroti() throws MashrootEXP{
        if(avg3 <= 10){
            throw  new MashrootEXP("mashroot !");
        }
    }

}
