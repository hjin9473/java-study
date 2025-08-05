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
		return false;
	}


	
	
	
	
}
