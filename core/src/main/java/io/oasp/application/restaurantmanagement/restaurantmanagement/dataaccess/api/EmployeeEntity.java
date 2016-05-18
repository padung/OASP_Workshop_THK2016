package io.oasp.application.restaurantmanagement.restaurantmanagement.dataaccess.api;

import io.oasp.application.restaurantmanagement.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Employee;
import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Restaurant;

import javax.persistence.*;

/**
 * Created by Pascal on 0017, 17. Mai.
 */
@Entity
@Table(name = "Employee")
public class EmployeeEntity extends ApplicationPersistenceEntity implements Employee{

    String firstName;

    String lastName;

    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
