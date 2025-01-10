package net.learntime.todo_api_1.utils;

import org.springframework.stereotype.Service;

@Service
public class StringIsBlank {
    public static boolean check(String str){
        return str == null || str.isBlank();
    }
}
