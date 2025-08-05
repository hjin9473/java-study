package homework14;

import java.util.HashSet;
import java.util.Set;

public class LotteryController {
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	boolean insertObject(Lottery l) {
		 return lottery.add(l);
	}
	
	boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		if (result && win != null) {
	        win.remove(l);
		}
	        return result;
	}
	public Set<Lottery> searchObject(){
		return lottery;
	}


	
	
	
	
}
