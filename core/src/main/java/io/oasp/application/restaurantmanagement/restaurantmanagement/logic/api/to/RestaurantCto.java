package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Employee;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.module.basic.common.api.to.AbstractCto;

import java.util.List;

/**
 * Created by Pascal on 0018, 18. Mai.
 */
public class RestaurantCto extends AbstractCto {

    private RestaurantEto restaurant;

    private List<EmployeeEto> employees;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantEto restaurant) {
        this.restaurant = restaurant;
    }

    public List<EmployeeEto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeEto> employees) {
        this.employees = employees;
    }
}
