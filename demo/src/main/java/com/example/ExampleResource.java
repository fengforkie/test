package com.example;

import com.entity.Role;
import io.smallrye.common.annotation.NonBlocking;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.mysqlclient.MySQLPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.RowSet;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    MySQLPool client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @NonBlocking
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET()
    @Path("test")
    public Multi<Role> getUser(){
        Uni<RowSet<Row>> rowSet = client.query("SELECT * FROM role").execute();
        Multi<Role> roles = rowSet.onItem().transformToMulti(set -> Multi.createFrom().iterable(set))
                .onItem().transform(Role::from);

        return roles;
    }

    
}