package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.impl.usecase;

import io.oasp.application.restaurantmanagement.general.logic.api.UseCase;
import io.oasp.application.restaurantmanagement.general.logic.base.AbstractUc;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.RestaurantEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.dao.RestaurantDao;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase.ManageRestaurantUc;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Pascal on 06.05.2016.
 */
@Named
@UseCase
public class ManageRestaurantUcImpl extends AbstractUc implements ManageRestaurantUc{

    @Inject
    RestaurantDao restaurantDao;

    @Override
    @PermitAll
    public Restaurant saveRestaurant(RestaurantEto restaurant) {
        RestaurantEntity restaurantEntity = getBeanMapper().map(restaurant, RestaurantEntity.class);
        RestaurantEntity savedRestaurant = this.restaurantDao.save(restaurantEntity);
        Restaurant returnRestaurant = getBeanMapper().map(savedRestaurant, RestaurantEto.class);
        return returnRestaurant;
    }

    @Override
    @PermitAll
    public void deleteRestaurant(Long id) {
        restaurantDao.delete(id);
    }
}
