package services;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
@Produces(MediaType.TEXT_PLAIN)
public class Calculator {

    @GET
    @Path("add")
    public String add(@QueryParam("a")int a, @QueryParam("b")int b){
        
    	if(a+b < 0) {
    		throw new InternalServerErrorException();
    	}
    	return String.valueOf(a+b);
    	
    }
}
