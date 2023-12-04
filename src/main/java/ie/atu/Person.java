package ie.atu;

import java.util.Scanner;
public class Person {
    private String name;
    private String userAddress;
    private String userNumber;


    public Person() {
        this.name = "";
        this.userAddress = "";
        this.userNumber = "";
    }

    public Person(String name, String userAddress, String userNumber) {
        this.name = name;
        this.userAddress = userAddress;
        this.userNumber = userNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userNumber='" + userNumber + '\'' +
                '}';
    }
}
