package collection.list;

import constant.ListNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author alfred.zhang
 * @date 2021/10/25
 */
public class User {

    public User() {

    }

    public User(Integer age) {
        setAge(age);
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void remove(List<User> userList) {
        if (userList == null || userList.size() == 0) {
            return;
        }

        Iterator<User> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getAge() != null && user.getAge() > 20) {
                userIterator.remove();
            }
        }

    }

    public static void main(String[] args) {

        User user1 = new User(17);
        User user2 = new User(21);
        User user3 = new User(18);
        User user4 = new User(21);
        User user5 = new User(19);
        User user6 = new User(21);
        User user7 = new User(20);
        User user8 = new User(21);
        List<User> userList = new ArrayList<>(8);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);

        System.out.println("before");
        print(userList);

        remove(userList);

        System.out.println("after");
        print(userList);

    }

    public static void print(List<User> userList) {
        for (User u : userList) {
            System.out.println("user age:" + u.getAge());
        }
    }
}
