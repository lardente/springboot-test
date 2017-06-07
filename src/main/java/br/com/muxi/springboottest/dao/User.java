package br.com.muxi.springboottest.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lardente on 07/06/2017.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName
                + "]";
    }

}