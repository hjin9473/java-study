package homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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
	
	public Set<Lottery> winObject(){
		    if (lottery.size() < 4) {
		        return null;
		    }

		    List<Lottery> candidateList = new ArrayList<>(lottery);

		    win.removeIf(l -> !lottery.contains(l));

		    int toSelect = 4 - win.size();
		    if (toSelect > 0) {
		        List<Lottery> availableCandidates = new ArrayList<>(candidateList);
		        availableCandidates.removeAll(win);

		        Collections.shuffle(availableCandidates);

		        for (int i = 0; i < toSelect && i < availableCandidates.size(); i++) {
		            win.add(availableCandidates.get(i));
		        }
		    }

		    return win;
		}

	
	
	public Set<Lottery> sortedWinObject(){
		List<Lottery> winl = new ArrayList<Lottery>(win);
		Collections.sort(winl);
		return new LinkedHashSet<>(winl);
	}
	
	public boolean searchWinner(Lottery l) {
		if (win.contains(l)) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
}
