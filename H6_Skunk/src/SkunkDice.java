
public class SkunkDice extends Dice
{
	
	public boolean isDeuce() { 
		
		return	(getDie1().getLastRoll() == 1) && (getDie2().getLastRoll() == 2 ) ||
				(getDie2().getLastRoll() == 1 ) && (getDie1().getLastRoll() == 2 );
				
	}

	public boolean isDoubleSkunk() {		
		
		return	(getDie1().getLastRoll() == 1 && getDie2().getLastRoll() == 1);
				
	
	}

	public boolean isOneSkunk() {
		
		return	((getDie1().getLastRoll() == 1 && getDie2().getLastRoll() > 2) || (getDie2().getLastRoll() == 1 && getDie1().getLastRoll() > 2));
				
	}
	
	
}