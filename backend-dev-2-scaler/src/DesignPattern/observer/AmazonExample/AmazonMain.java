package DesignPattern.observer.AmazonExample;

import java.util.ArrayList;
import java.util.List;

public class AmazonMain {

    public static AmazonMain instance;

    public List<OrderPlacedEvents> orderPlacedEventsList = new ArrayList<>();

    public static AmazonMain getInstance(){

        if(instance == null){

            instance = new AmazonMain();

        }

        return instance;

    }

    public void addOrderPlacedEvents(OrderPlacedEvents orderPlacedEvents){

        orderPlacedEventsList.add(orderPlacedEvents);

    }

    void orderPlaced(){

        for(OrderPlacedEvents orderPlacedEvents : orderPlacedEventsList){

            orderPlacedEvents.OnOrderPlaced();
        }
    }
}
