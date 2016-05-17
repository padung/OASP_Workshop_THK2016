package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.RestaurantEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;

import java.util.List;

/**
 * Created by Pascal on 06.05.2016.
 */
public interface FindRestaurantUc {

    Restaurant findRestaurant(Long id);

    List<Restaurant> findAll();

}
