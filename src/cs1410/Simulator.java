package cs1410;

public class Simulator
{
	
	private static Ticker ticker = new Ticker();
	public static void main(String[] args)
	{
		//pump number, till number, p, q, trucks?
		Station station = new Station(3, 3, 0.02, 0.05, true);
		station.setPetrolPrice(1.20);
		
		for(ticker.getTick(); ticker.getTick() <= ticker.getMaxTicks(); ticker.increment()) {
			delay(10);
				System.out.println("tick: " + ticker.getTick());
				station.tick(ticker.getTick());
				//station.generateVehicle();
			}
			System.out.println("-------------------------------------");
			System.out.println("this has caused loss of " + station.getLoss());
			System.out.println("there has been profit of: " + station.getIncome());
			System.out.println("The pump queues look like ");
			for(Pump tick : station.getPumpList()){
				System.out.println(tick.getQueue().toString());
			}
			System.out.println("-------------------------------------");
			System.out.println(Truck.getProbabilityOfT());
	}
		
		
			
	//Return the total number of ticks that have gone past so far (time)
	public static int getTicks()
	{
	  return  ticker.getTick(); 
	}
	private static void delay(int millisecs)
    {
        try {
            Thread.sleep(millisecs);
        }
        catch (InterruptedException ie) {
        }
    }
}
