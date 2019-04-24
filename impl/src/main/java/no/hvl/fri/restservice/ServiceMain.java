package no.hvl.fri.restservice;

import static spark.Spark.get;
import static spark.Spark.port;

public class ServiceMain {

public static void main(String[] args){
		
		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}
		  
        get("/hello", (request, response) -> "Hello World!");
    }
}
