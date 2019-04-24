package no.hvl.fri.restservice;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.port;

import com.google.gson.Gson;

import no.hvl.fri.dataaccess.FireRiskResponse;
import no.hvl.fri.dataaccess.SimpleStorage;

public class ServiceMain {

public static void main(String[] args){
		
		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}
		
		SimpleStorage storage = new SimpleStorage();
		
		// the service generates JSON
		after((req, res) -> {
	  		  res.type("application/json");
	  		});
		
		// path for very basic testing of the service
        get("/fri/hello", (request, response) -> "A Response from the FRI REST service application");
        
        get("/fri/:sid", (request, response) -> {
        	
        	int sid = Integer.parseInt(request.params(":sid"));
        	
        	FireRiskResponse friresp = storage.lookup(sid);
            
        	Gson gson = new Gson(); 
        	
        	return gson.toJson(friresp,FireRiskResponse.class);
        	
        });
    }
}
