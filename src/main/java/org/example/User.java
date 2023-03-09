package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    int id;
    String name;
    int salary;
    int departmentId;
    Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                ", address=" + address +
                '}';
    }
}
