package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class Amazon_Service {
    Amazon_Repositry r;
    public void  addOrder( Order order){
        r.addOrder(order);
    }
    public void  addPartner(String partnerId){
        r.addPartner(partnerId);
    }

    public void  addOrderPartnerPair(String orderId,String partnerId){
        r.addOrderPartnerPair( orderId,partnerId);
    }
    public Order  getOrderById(String orderId){

        return r.getOrderById(orderId);
    }

    public DeliveryPartner getPartnerById( String partnerId){

       return r.getPartnerById(partnerId);

    }
    public Integer getOrderCountByPartnerId( String partnerId){

       return  r.getOrderCountByPartnerId(partnerId);



    }
    public List<String> getOrdersByPartnerId( String partnerId){

        return r.getOrdersByPartnerId(partnerId);


    }

    public List<String> getAllOrders(){
       return r.getAllOrders();
    }

    public Integer getCountOfUnassignedOrders(){
      return  r.getCountOfUnassignedOrders();

    }

    public Integer getOrdersLeftAfterGivenTimeByPartnerId( String time, String partnerId){

        return r.getOrdersLeftAfterGivenTimeByPartnerId(time,partnerId);
    }

    public String getLastDeliveryTimeByPartnerId( String partnerId){
        return r.getLastDeliveryTimeByPartnerId(partnerId);

    }

    public void deletePartnerById( String partnerId){

         r.deletePartnerById(partnerId);

    }
    public void deleteOrderById( String orderId){

        r.deleteOrderById(orderId);

    }


}
