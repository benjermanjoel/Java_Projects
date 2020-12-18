package model;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private Integer age;
    private String favoriteColor;

    //Constructors
    public Person() {
    }

    public Person(String firstName, String lastName, int age, String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }
    //Getters and Setters
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
    //To-string method
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}
