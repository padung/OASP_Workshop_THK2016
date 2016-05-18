package io.oasp.application.restaurantmanagement.restaurantmanagement.logic.api.to;

import io.oasp.application.restaurantmanagement.restaurantmanagement.common.api.Employee;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * Created by Pascal on 0018, 18. Mai.
 */
public class EmployeeEto extends AbstractEto implements Employee {

    String firstName;

    String lastName;

    int age;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
