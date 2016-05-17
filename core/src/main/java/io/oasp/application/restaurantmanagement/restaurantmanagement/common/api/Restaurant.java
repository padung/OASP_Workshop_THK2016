package io.oasp.application.restaurantmanagement.restaurantmanagement.common.api;

/**
 * Created by Pascal on 06.05.2016.
 */
public interface Restaurant {

    String getRestaurantName();

    void setRestaurantName(String restaurantName);

    String getAddress();

    void setAddress(String address);

    String getMainLanguage();

    void setMainLanguage(String language);

}
