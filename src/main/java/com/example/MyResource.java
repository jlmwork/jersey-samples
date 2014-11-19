package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Providers;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    @Context
    protected Providers providers;

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    //@Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    /*
     public List<String> getIt() {
     List list = new ArrayList();
     list.add("Got it!");
     return list;
     }*/
    /*
     public Response getIt() {
     List<String> strings = new ArrayList<String>();
     strings.add("s1");
     strings.add("s2");
     GenericEntity<List<String>> entity = new GenericEntity<List<String>>(strings) {
     };
     return Response.ok(entity).build();
     }*/
    public SimpleBean get() {
        return new SimpleBean(null, 1, true);
    }

    @Path("/list")
    @GET
    //@Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getIt() {
        List list = new ArrayList();
        list.add("Got it!");
        return list;
    }

    @Path("/2")
    @GET
    //@Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleBean get2() {
        return new SimpleBean(null, 1, null);
    }

}
