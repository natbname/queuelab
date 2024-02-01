public class AirlineCheckinMain 
{
    /** 
     * Main method.
    @param args Not used
    */
    public static void main(String args[]) 
    {
        AirlineCheckinSim sim = new AirlineCheckinSim();
        sim.enterData();
        sim.runSimulation();
        sim.showStats();
        System.exit(0);
    }
}

/** 
 * Assignment questions:
 * 1. 
 * 
 * Time is 0: Frequent Flyer arrival, new queue size is 1. 
 * Time is 0: Regular Passenger arrival, new queue size is 1.
 * Time is 0: Serving Frequent Flyer with timestamp 0, service time 2.
 * Time is 1: Frequent Flyer arrival, new queue size is 2. 
 * Time is 1: Regular Passenger arrival, new queue size is 2.
 * Time is 2: Regular Passenger arrival, new queue size is 3.
 * Time is 2: Serving Regular Passenger with timestamp 0, service time 1.
 * Time is 3: Frequent Flyer arrival, new queue size is 2. 
 * Time is 3: Regular Passenger arrival, new queue size is 3.
 * Time is 3: Serving Frequent Flyer with timestamp 1, service time 1.
 * Time is 4: Regular Passenger arrival, new queue size is 4.
 * Time is 4: Serving Regular Passenger with timestamp 1, service time 1.
 * Time is 5: Frequent Flyer arrival, new queue size is 2. 
 * Time is 5: Serving Frequent Flyer with timestamp 2, service time 3.
 * Time is 8: Serving Regular Passenger with timestamp 2, service time 1.
 * Time is 9: Serving Frequent Flyer with timestamp 3, service time 2.
 * Time is 11: Serving Regular Passenger with timestamp 3, service time 1.
 * Time is 12: Serving Regular Passenger with timestamp 4, service time 2.
 * Time is 14: Server is idle
 * 
 * The number of regular passengers served was 5, with an average wait time of 5.4
 * The number of frequent flyers served was 4, with an average wait time of 2.75
 * Passengers in frequent flyer queue: 0
 * Passengers in regular queue: 0
 * 
 * 2. 
 * 
 * Time is 0: Frequent Flyer arrival, new queue size is 1. 
 * Time is 0: Regular Passenger arrival, new queue size is 1.
 * Time is 0: Serving Frequent Flyer with timestamp 0, service time 2.
 * Time is 1: Frequent Flyer arrival, new queue size is 2. 
 * Time is 1: Regular Passenger arrival, new queue size is 2.
 * Time is 2: Regular Passenger arrival, new queue size is 3.
 * Time is 2: Serving Frequent Flyer with timestamp 1, service time 1.
 * Time is 3: Frequent Flyer arrival, new queue size is 1. 
 * Time is 3: Regular Passenger arrival, new queue size is 4.
 * Time is 3: Serving Regular Passenger with timestamp 0, service time 1.
 * Time is 4: Regular Passenger arrival, new queue size is 4.
 * Time is 4: Serving Frequent Flyer with timestamp 3, service time 3.
 * Time is 5: Frequent Flyer arrival, new queue size is 1.
 * Time is 7: Serving Frequent Flyer with timestamp 5, service time 2.
 * Time is 9: Serving Regular Passenger with timestamp 1, service time 1.
 * Time is 10: Serving Regular Passenger with timestamp 2, service time 1.
 * Time is 11: Serving Regular Passenger with timestamp 3, service time 1.
 * Time is 12: Serving Regular Passenger with timestamp 4, service time 2.
 * Time is 14: Server is idle
 * 
 * The number of regular passengers served was 5, with an average wait time of 7.0
 * The number of frequent flyers served was 4, with an average wait time of 1.75
 * Passengers in frequent flyer queue: 0
 * Passengers in regular queue: 0
 * 
 * 3. 
 * 
 * Time is 0: Frequent Flyer arrival, new queue size is 1. 
 * Time is 0: Regular Passenger arrival, new queue size is 1.
 * Time is 0: Serving Frequent Flyer with timestamp 0, service time 2.
 * Time is 1: Frequent Flyer arrival, new queue size is 2. 
 * Time is 1: Regular Passenger arrival, new queue size is 2.
 * Time is 2: Regular Passenger arrival, new queue size is 3.
 * Time is 2: Serving Frequent Flyer with timestamp 1, service time 1.
 * Time is 3: Frequent Flyer arrival, new queue size is 1. 
 * Time is 3: Regular Passenger arrival, new queue size is 4.
 * Time is 3: Serving Frequent Flyer with timestamp 2, service time 3.
 * Time is 4: Regular Passenger arrival, new queue size is 4.
 * Time is 5: Frequent Flyer arrival, new queue size is 1.
 * Time is 6: Serving Regular Passenger with timestamp 0, service time 1.
 * Time is 7: Serving Frequent Flyer with timestamp 5, service time 2.
 * Time is 9: Serving Regular Passenger with timestamp 1, service time 1.
 * Time is 10: Serving Regular Passenger with timestamp 2, service time 1.
 * Time is 11: Serving Regular Passenger with timestamp 3, service time 1.
 * Time is 12: Serving Regular Passenger with timestamp 4, service time 2.
 * Time is 14: Server is idle
 * 
 * The number of regular passengers served was 5, with an average wait time of 7.6
 * The number of frequent flyers served was 4, with an average wait time of 1.5
 * Passengers in frequent flyer queue: 0
 * Passengers in regular queue: 0
 * 
 * 4. Changing the order of these statements would change the output. 
 *    If both queues are empty and both statements find a passenger, the frequent flyer passenger would be served first. 
 *    However, if the statements were switched and both queues were empty, the regular passenger would be served first.
 * 
 * testing that i'm still connected to github after my key expired!
 */
