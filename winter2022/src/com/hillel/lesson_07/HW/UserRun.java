package com.hillel.lesson_07.HW;

import com.hillel.lesson_07.HW.dto.User;
import com.hillel.lesson_07.HW.service.impl.UserServiceImpl;
import com.hillel.lesson_07.HW.utils.UserGenerator;

public class UserRun {
    public static void main(String[] args) {
        User[] users = UserGenerator.generateUser(); // get users from method

        // todo: add functionality get user from console

        new UserServiceImpl().print(users);
    }
}
