package DesignPattern.strategy.googleMapExample;

import java.util.Objects;

public class RouteCalculatorFactory {

    static RouteCalculator getRouteCalculatorObject(String mode){

        if(Objects.equals(mode, "car")){

            return new CarRouteCalculator();

        }
        else if(Objects.equals(mode, "bike")){

            return new BikeRouteCalculator();

        }

        return null;
    }
}
