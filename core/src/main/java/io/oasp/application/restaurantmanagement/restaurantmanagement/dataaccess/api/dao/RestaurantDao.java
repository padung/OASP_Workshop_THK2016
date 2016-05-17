package io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.dao;

import io.oasp.application.restaurantmanagement.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.RestaurantEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * Created by Pascal on 06.05.2016.
 */
public interface RestaurantDao extends ApplicationDao<RestaurantEntity>, MasterDataDao<RestaurantEntity> {
}
