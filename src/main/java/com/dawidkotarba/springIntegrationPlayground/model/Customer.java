package com.dawidkotarba.springIntegrationPlayground.model;

import java.util.Objects;

public class Customer {

    /*
    {
	"id": 1,
	"login": "dawid",
	"age": 32
    }
     */

    private long id;
    private String login;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                age == customer.age &&
                Objects.equals(login, customer.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", age=" + age +
                '}';
    }
}
