package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.impl.usecase;

import io.oasp.application.restaurantmanagement.general.logic.api.UseCase;
import io.oasp.application.restaurantmanagement.general.logic.base.AbstractUc;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Employee;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.EmployeeEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.RestaurantEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api.dao.RestaurantDao;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.EmployeeEto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantCto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to.RestaurantEto;
import io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.usecase.FindRestaurantUc;
import net.sf.mmm.util.lang.api.Usecase;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pascal on 06.05.2016.
 */
@Named
@UseCase
public class FindRestaurantUcImpl extends AbstractUc implements FindRestaurantUc {

    @Inject
    RestaurantDao restaurantDao;

    @Override
    @PermitAll
    public RestaurantCto findRestaurant(Long id) {

        RestaurantEntity restaurant = this.restaurantDao.findOne(id);
        RestaurantEto returnRestaurantEto = getBeanMapper().map(restaurant, RestaurantEto.class);

        List<EmployeeEntity> employees = restaurant.getEmployees();
        List<EmployeeEto> returnEmployeeEtos = getBeanMapper().mapList(employees, EmployeeEto.class);

        RestaurantCto returnRestaurant = new RestaurantCto();
        returnRestaurant.setEmployees(returnEmployeeEtos);
        returnRestaurant.setRestaurant(returnRestaurantEto);

        return returnRestaurant;
    }

    public List<Restaurant> findAll() {
        List<RestaurantEntity> allRestaurants = this.restaurantDao.findAll();
        List<Restaurant> returnRestaurants = new ArrayList();

        for (RestaurantEntity entity : allRestaurants) {
            returnRestaurants.add(getBeanMapper().map(entity, RestaurantEto.class));
        }
        return returnRestaurants;
    }
}
