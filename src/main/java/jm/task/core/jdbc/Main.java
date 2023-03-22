package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Aleksandr1", "Trofimov", (byte) 26);
        userService.saveUser("Aleksandr2", "Trofimov", (byte) 26);
        userService.saveUser("Aleksandr3", "Trofimov", (byte) 26);
        userService.saveUser("Aleksandr4", "Trofimov", (byte) 26);
        List<User> userList = userService.getAllUsers();
        System.out.println(userList);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
