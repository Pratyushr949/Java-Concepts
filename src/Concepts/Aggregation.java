package Concepts;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + address.city);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address a1 = new Address("Delhi");
        Employee e1 = new Employee(101, a1);

        e1.display();
    }
}