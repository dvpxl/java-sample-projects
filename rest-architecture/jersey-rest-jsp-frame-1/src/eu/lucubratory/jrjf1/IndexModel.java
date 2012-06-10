package eu.lucubratory.jrjf1;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.view.Viewable;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class IndexModel {

	@GET
	@Path("index")
	public Viewable index(@Context HttpServletRequest request) {
		request.setAttribute("obj", new String("IT Works"));
		System.out.println("/INDEX called");
		return new Viewable("/index.jsp", null);
	}
}
