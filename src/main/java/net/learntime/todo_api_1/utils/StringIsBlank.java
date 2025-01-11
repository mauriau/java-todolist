package net.learntime.todo_api_1.utils;

import org.springframework.stereotype.Service;

@Service
public class StringIsBlank {
    public static boolean isNullOrBlank(String str){
        return str == null || str.isBlank();
    }
}
