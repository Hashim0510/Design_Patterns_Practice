package DesignPattern.strategy.googleMapExample;

public class googleMapMain {

    RouteCalculator routeCalculator;

    void findRoute(String source, String destination, String mode){

        routeCalculator = RouteCalculatorFactory.getRouteCalculatorObject(mode);

        routeCalculator.findRoute(source, destination);
    }


}
