package az.coders.chapter1.lesson10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExmp {


    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>();
        userSet.add(new User("User1", 2));
        userSet.add(new User("User2", 1));


        userSet.forEach(System.out::println);
    }


}

class User implements Comparable {

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }




    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (this.id > user.id)
            return 1;
        else if (this.id < user.id)
            return -1;
        else return 0;
    }
}
