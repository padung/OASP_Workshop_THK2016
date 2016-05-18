package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.impl;

import io.oasp.application.restaurantmanagement.general.logic.base.AbstractComponentFacade;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.RestaurantManagement;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantCto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase.FindRestaurantUc;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase.ManageRestaurantUc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Pascal on 06.05.2016.
 */
@Named
@Transactional
public class RestaurantManagementImpl extends AbstractComponentFacade implements RestaurantManagement {

    @Inject
    FindRestaurantUc findRestaurantUc;

    @Inject
    ManageRestaurantUc manageRestaurantUc;

    @Override
    public RestaurantCto findRestaurant(Long id) {
        return this.findRestaurantUc.findRestaurant(id);
    }

    @Override
    public Restaurant saveRestaurant(RestaurantEto restaurant) {
        return this.manageRestaurantUc.saveRestaurant(restaurant);
    }

    @Override
    public void deleteRestaurant(Long id) {
        this.manageRestaurantUc.deleteRestaurant(id);
    }

    public List<Restaurant> findAll(){
        return this.findRestaurantUc.findAll();
    }
}
