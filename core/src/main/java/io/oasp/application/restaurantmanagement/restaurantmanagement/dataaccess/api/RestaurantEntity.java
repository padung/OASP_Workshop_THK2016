package io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api;

import io.oasp.application.restaurantmanagement.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pascal on 06.05.2016.
 */
@Entity
@Table(name = "Restaurant")
public class RestaurantEntity extends ApplicationPersistenceEntity implements Restaurant {

    String restaurantName;

    String address;

    String mainLanguage;

    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }

    @Override
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}
