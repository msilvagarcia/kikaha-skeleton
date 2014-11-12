package skeleton;

import kikaha.urouting.api.GET;
import kikaha.urouting.api.Path;
import trip.spi.Singleton;

@Singleton
@Path("hello")
public class HelloWorldHandler {

	@GET
	public String hello() {
		return "Hello World";
	}

}
