
/**
 * A car has a certain fuel efficiency and a certain mamount of fuel in the gas tank.
 * The car may be driven which redices the amound of gas in the fuel tank.
 * 
 * @author Felix Zheng
 * @version 10 September 2015 * 
 */
public class Car
{
    /** the fuel efficiency for the car measured in units of miles/gallong (mpg) */
    private double fuelEfficiency;
    /** the amount of fuel in the tank of the car measured in units of gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car( double fuelEfficiency )
    {
        fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
        
    }

    /**
     * This method simulates driving the car for the specified distance and reduces the amount of gas in the fuel tank.
     * 
     * @pre         the specified distance will not consume more than the available gas
     * @param       distance    the specified distance to drive in units of miles
     */
    public void drive( double distance )
    {
        
    }
}
