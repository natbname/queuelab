/** 
 * Simulate the check-in process of an airline.
*/
import java.util.Scanner; 

public class AirlineCheckinSim 
{
// Data Fields
/** Queue of frequent flyers. */
    private PassengerQueue frequentFlyerQueue = new PassengerQueue("Frequent Flyer");
/** Queue of regular passengers. */
    private PassengerQueue regularPassengerQueue = new PassengerQueue("Regular Passenger");
/** Maximum number of frequent flyers to be served before a regular passenger gets served. */
    private int frequentFlyerMax;
/** Maximum time to service a passenger. */
    private int maxProcessingTime;
/** Total simulated time. */
    private int totalTime;
/** If set true, print additional output. */
    private boolean showAll;
/** Simulated clock. */
    private int clock = 0;
/** Time that the agent will be done with the current passenger.*/
    private int timeDone;
/** Number of frequent flyers served since the last regular passenger was served. */
    private int frequentFlyersSinceRP;
    
    private Scanner s = new Scanner(System.in);
    
    public void enterData()
    {
        System.out.println("Expected number of frequent flyer arrivals per hour: ");
        frequentFlyerQueue.arrivalRate(s.nextDouble()/60); //divided to get passenger/min
        
        System.out.println("Expected number of regular passenger arrivals per hour: ");
        regularPassengerQueue.arrivalRate(s.nextDouble()/60);
        
        System.out.println("The maximum number of frequent flyers served between regular passengers: ");
        frequentFlyerMax = s.nextInt();
        
        System.out.println("Maximum service time in minutes: ");
        Passenger.setMaxProcessingTime(s.nextInt());
        
        System.out.println("The total simulation time in minutes: ");
        totalTime = s.nextInt();
        
        System.out.println("Display minute-by-minute trace of simulation? (Y/N)"); 
        String minBy = s.next();
        if(minBy.equals("y")||minBy.equals("Y"))
        {
            showAll = true;
        }
        else if(minBy.equals("n")||minBy.equals("N"))
        {
            showAll = false;
        }
        else
        {
            System.out.println("Please enter y or n.");
        }
    }
    
    
    public void runSimulation() 
    {
        for (clock = 0; clock < totalTime; clock++) 
        {
            frequentFlyerQueue.checkNewArrival(clock, showAll);
            regularPassengerQueue.checkNewArrival(clock, showAll);
            if (clock >= timeDone) 
            {
                startServe();
            }
        }
    }
    
    public void startServe() {
        if (!frequentFlyerQueue.isEmpty() && ((frequentFlyersSinceRP <= frequentFlyerMax) || regularPassengerQueue.isEmpty())) 
        {
        // Serve the next frequent flyer.
            frequentFlyersSinceRP++;
            timeDone = frequentFlyerQueue.update(clock, showAll);
        } 
        else if (!regularPassengerQueue.isEmpty()) 
        {
        // Serve the next regular passenger.
            frequentFlyersSinceRP = 0;
            timeDone = regularPassengerQueue.update(clock, showAll);
        } 
        else if (showAll) 
        {
            System.out.println("Time is " + clock + " server is idle");
        }
    }
    
    /** Method to show the statistics.*/
    public void showStats() 
    {
            System.out.println("\nThe number of regular passengers served was " + regularPassengerQueue.getNumServed());
            double averageWaitingTime = (double) regularPassengerQueue.getTotalWait() / (double) regularPassengerQueue.getNumServed();
            System.out.println(" with an average waiting time of " + averageWaitingTime);
            System.out.println("The number of frequent flyers served was " + frequentFlyerQueue.getNumServed());
            averageWaitingTime = (double) frequentFlyerQueue.getTotalWait() / (double) frequentFlyerQueue.getNumServed();
            System.out.println(" with an average waiting time of " + averageWaitingTime);
            System.out.println("Passengers in frequent flyer queue: " + frequentFlyerQueue.size());
            System.out.println("Passengers in regular passenger queue: " + regularPassengerQueue.size());
    }
}