package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<String, ForumUser> theResultMapOfUsers =  forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getUserSex() != 'F' &&
                        LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20  &&
                        forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(forumUser -> String.valueOf(forumUser.getUserId()), forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);



    }
}
