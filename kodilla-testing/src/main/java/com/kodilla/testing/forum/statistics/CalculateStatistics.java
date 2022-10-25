package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.List;

public class CalculateStat {

    private Statistics statistics;
    private static int postsQuantity = 0;
    private static int commentsQuantity = 0;
    private static int usersQuantity = 0;
    private static int averagePostsForUser = 0;
    private static int averageCommentsForUser = 0;
    private static int averageCommentsForPost = 0;

    public CalculateStat(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<String> userNames() {
        return statistics.usersNames();
    }

    public static void calculateAdvStatistics(Statistics statistics) {
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        usersQuantity = statistics.usersNames().size();
        averagePostsForUser = statistics.postsCount() / statistics.usersNames().size();
        averageCommentsForUser = statistics.commentsCount() / statistics.usersNames().size();
        averageCommentsForPost = statistics.commentsCount() / statistics.postsCount();
    }

    public static void postCounter() {
        postsQuantity++;
    }

    public static void commentCounter() {
        commentsQuantity++;
    }

    public int postsCount() {
        return postsQuantity;
    }

    public int commentsCount() {
        return commentsQuantity;
    }

    public static void showStatistics() {
        System.out.println("Statistics: 1.Quantity of users: " + usersQuantity + "\n" +
                "2.Quantity of posts: " + postsQuantity + "\n" + "3.Quantity of comments: " + commentsQuantity +
                "\n" + "4.Average posts for user: " + averagePostsForUser + "\n" +
                "5.Average comments for user: " + averageCommentsForUser + "\n" +
                "6.Average comments for post: " + averageCommentsForPost);
    }

    @Override
    public String toString() {
        return "Users quantity: " + usersQuantity + ", posts quantity: " + postsQuantity + ", comments quantity: " +
        ", mean posts for user: " + averagePostsForUser + ", mean comments for user: " + averageCommentsForUser +
                ", mean comments on post: " + averageCommentsForPost;
    }
}
