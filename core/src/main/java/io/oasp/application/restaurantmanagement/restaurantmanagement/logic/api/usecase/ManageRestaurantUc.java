package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;

/**
 * Created by Pascal on 06.05.2016.
 */
public interface ManageRestaurantUc {

    Restaurant saveRestaurant(RestaurantEto restaurant);

    void deleteRestaurant(Long id);

}
