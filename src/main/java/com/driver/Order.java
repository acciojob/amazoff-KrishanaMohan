package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        this.id=id;
        String f="";
        String s="";
        int i=0;
        for( i=0;i<deliveryTime.length();i++){
            if(deliveryTime.charAt(i)==':')
                break;
            f+=deliveryTime.charAt(i);
        }
        for( int j=i+1;j<deliveryTime.length();j++){

            s+=deliveryTime.charAt(i);
        }

        this.deliveryTime= Integer.valueOf(f)*60+Integer.valueOf(s);


        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
