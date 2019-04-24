package no.hvl.fri.dataaccess;

import java.time.ZonedDateTime;
import java.util.HashMap;

public class SimpleStorage {

	private HashMap<Integer,FireRiskIndication> fri;
	
	public SimpleStorage() {
		fri = new HashMap<Integer,FireRiskIndication>();
		
		// put in some dummy locations
		
		FireRiskIndication ind = 
				new FireRiskIndication(1, 2.0, 3.0, 5, 
						ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));
		
		fri.put(1, ind);
	}
	
	public FireRiskResponse lookup(int sid) {
		FireRiskIndication ind = fri.get(sid);
		
		boolean success = (ind != null);
		
		return new FireRiskResponse(success,ind);
	}
	
}
