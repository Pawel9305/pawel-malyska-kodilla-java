package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private Statistics statistics;
    private int postsQuantity;
    private int commentsQuantity;

    private int usersQuantity;
    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity != 0 && postsQuantity != 0) {
            averagePostsForUser = (double) postsQuantity / (double) usersQuantity;
            if (commentsQuantity != 0) {
                averageCommentsForUser = (double) commentsQuantity / usersQuantity;
                averageCommentsForPost = (double) commentsQuantity / postsQuantity;
            }
        }
    }
    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
    public void showStatistics() {
        System.out.println("Statistics: " + "\n" + "1.Quantity of users: " + usersQuantity + "\n" +
                "2.Quantity of posts: " + postsQuantity + "\n" + "3.Quantity of comments: " + commentsQuantity +
                "\n" + "4.Average posts for user: " + averagePostsForUser + "\n" +
                "5.Average comments for user: " + averageCommentsForUser + "\n" +
                "6.Average comments for post: " + averageCommentsForPost);
    }
}
