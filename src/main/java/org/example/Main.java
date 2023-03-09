package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        Address address1 = new Address("Brest", "YK", 17);
        Address address2 = new Address("Brest", "RS", 11);
        Address address3 = new Address("'Wroclaw", "Lenina", 1);
        Address address4 = new Address("Minsk", "Ordj", 29);
        Address address5 = new Address("Wroclaw", "Lenina", 18);

        User user1 = new User(1, "Raman", 1000, 1, address1);
        User user2 = new User(2, "Anha", 2500, 1, address2);
        User user3 = new User(3, "Artem", 1500, 2, address3);
        User user4 = new User(4, "Alex", 1700, 2, address4);
        User user5 = new User(5, "Ivan", 3000, 3, address5);

        Department department = new Department(1, "Java");
        Department department2 = new Department(2, "C#");
        Department department3 = new Department(3, "JavaScript");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        departments.add(department);
        departments.add(department2);
        departments.add(department3);

        Count count = new Count();
        count.countMaxSal(users, departments);
    }
}