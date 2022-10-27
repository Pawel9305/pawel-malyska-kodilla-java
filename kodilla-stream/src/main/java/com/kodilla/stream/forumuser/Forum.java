package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

   private final List<ForumUser> usersList = new ArrayList<>();

   public Forum() {
       usersList.add(new ForumUser(1, "John", 'M', LocalDate.of(1990, Month.APRIL, 12), 10));
       usersList.add(new ForumUser(2, "Dave", 'M', LocalDate.of(1993,Month.MAY, 27), 5));
       usersList.add(new ForumUser(3, "Isabella", 'F', LocalDate.of(1995,Month.JULY, 12), 12));
       usersList.add(new ForumUser(4, "Catherine", 'F', LocalDate.of(2000,Month.OCTOBER, 20), 1));
       usersList.add(new ForumUser(5, "Mark", 'M', LocalDate.of(2006, Month.NOVEMBER, 12), 2));
       usersList.add(new ForumUser(6, "Jeanette", 'F', LocalDate.of(2004, Month.AUGUST, 4), 0));
       usersList.add(new ForumUser(7, "Bridgette", 'F', LocalDate.of(2002, Month.JULY, 15), 10));
       usersList.add(new ForumUser(8, "Albert", 'M', LocalDate.of(1998,Month.OCTOBER, 15), 1));
   }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
