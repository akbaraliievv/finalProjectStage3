package service.impl;

import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserServiceImpl implements UserService {
   private List<User>userList = new ArrayList<>();

    @Override
    public String createUser(List<User> users) {
        this.userList = users;
        userList.stream().forEach(System.out::println);
    return "Users successfully added";
    }

    @Override
    public List<User> findAllUsers() {
        return userList.stream().toList();
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        userList.remove(name);
        return name;
    }

    @Override
    public void updateUser(Long id) {
    }

    @Override
    public void groupUsersByGender() {
      userList.stream().sorted(Comparator.comparing(User::getGender)).forEach(System.out::println);
    }

    @Override
    public String buyBooks(String name, List<Book> books) {

        return null;
    }
}
