package io.oasp.application.restaurantmanagement.restaurantmanagement.service.api.rest;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.RestaurantManagement;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;

import javax.inject.Inject;
import javax.inject.Named;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Pascal on 06.05.2016.
 */
@Path("/restaurantmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Named("RestaurantmanagementRestService")
public class RestaurantManagementRestServiceImpl {

    @Inject
    RestaurantManagement restaurantManagement;

    @GET
    @Path("/restaurant/{id}")
    public Restaurant getRestaurant(@PathParam("id") long id){

        return this.restaurantManagement.findRestaurant(id);
    }

    @POST
    @Path("/restaurant")
    public Restaurant saveRestaurant(RestaurantEto restaurant){

        return this.restaurantManagement.saveRestaurant(restaurant);
    }

    @GET
    @Path("/restaurant")
    public List<Restaurant> getAllRestaurants(){
        return this.restaurantManagement.findAll();
    }

    @DELETE
    @Path("/restaurant")
    public void deleteRestaurant(RestaurantEto restaurant){
        this.restaurantManagement.deleteRestaurant(restaurant.getId());
    }
}
