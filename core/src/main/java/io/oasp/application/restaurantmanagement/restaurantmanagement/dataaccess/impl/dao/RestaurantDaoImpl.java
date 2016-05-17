package io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.impl.dao;

import io.oasp.application.restaurantmanagement.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.dao.RestaurantDao;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.RestaurantEntity;

import javax.inject.Named;

/**
 * Created by Pascal on 06.05.2016.
 */
@Named
public class RestaurantDaoImpl extends ApplicationMasterDataDaoImpl<RestaurantEntity> implements RestaurantDao {

    @Override
    protected Class<RestaurantEntity> getEntityClass() {
        return RestaurantEntity.class;
    }
}
