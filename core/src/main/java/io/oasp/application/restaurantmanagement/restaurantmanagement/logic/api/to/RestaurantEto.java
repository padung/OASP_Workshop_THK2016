package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * Created by Pascal on 06.05.2016.
 */
public class RestaurantEto extends AbstractEto implements Restaurant {

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

    @Override
    public String getMainLanguage() {
        return this.mainLanguage;
    }

    @Override
    public void setMainLanguage(String language) {
        this.mainLanguage = language;
    }
}
