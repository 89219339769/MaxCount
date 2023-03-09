package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Count {
     public void countMaxSal(List<User> users, List<Department> departments) {

        for (Department department : departments) {
            List<User> usersTemp = new ArrayList<>();
            for (User user : users) {
                if (user.getDepartmentId() == department.getId()) {
                    usersTemp.add(user);
                }
            }
            User user = usersTemp.stream()
                    .max(Comparator.comparingInt(User::getSalary))
                    .get();
            System.out.println(department.getName()+"-"+user.getSalary());
        }
    }
}
