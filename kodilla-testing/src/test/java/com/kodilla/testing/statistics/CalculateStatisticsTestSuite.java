package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Nested
    @DisplayName("Tests for calculating statistics")
    class calculateStatistics {

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("Beginning of statistics tests: ");

        }
        @AfterAll
        public static void afterAllTests() {
            System.out.println("Tests ending.");
        }

        public List<String> addUsers(int usersQuantity) {
            List<String> names = new ArrayList<>();
            for (int i = 0; i < usersQuantity; i++) {
                names.add("User" + i);
            }
            return names;
        }

        @Test
        void calculateAdvStatisticsNoPosts() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(addUsers(10));
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            int resultUsers = calculateStatistics.getUsersQuantity();
            int resultPosts = calculateStatistics.getPostsQuantity();
            int resultComments = calculateStatistics.getCommentsQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(10, resultUsers);
            assertEquals(0, resultPosts);
            assertEquals(0, resultComments);
            assertEquals(0, averagePostsForUser);
            assertEquals(0, averageCommentsForUser);
            assertEquals(0, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }

        @Test
        void calculateAdvStatistics1000Posts() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(addUsers(10));
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            int resultPosts = calculateStatistics.getPostsQuantity();
            int resultComments = calculateStatistics.getCommentsQuantity();
            int usersQuantity = calculateStatistics.getUsersQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(1000, resultPosts);
            assertEquals(0, resultComments);
            assertEquals(10, usersQuantity);
            assertEquals(100, averagePostsForUser);
            assertEquals(0, averageCommentsForUser);
            assertEquals(0, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }

        @Test
        void calculateAdvStatisticsNoComments() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(addUsers(10));
            when(statisticsMock.postsCount()).thenReturn(20);
            when(statisticsMock.commentsCount()).thenReturn(0);
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            int commentsResult = calculateStatistics.getCommentsQuantity();
            int postsResult = calculateStatistics.getPostsQuantity();
            int usersResult = calculateStatistics.getUsersQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(0, commentsResult);
            assertEquals(20, postsResult);
            assertEquals(10, usersResult);
            assertEquals(2, averagePostsForUser);
            assertEquals(0, averageCommentsForUser);
            assertEquals(0, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }

        @Test
        void calculateAdvStatisticsMoreCommentsThanPosts() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.usersNames()).thenReturn(addUsers(20));
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            calculateStatistics.calculateAdvStatistics(statisticsMock);
            int commentsResult = calculateStatistics.getCommentsQuantity();
            int postsResult = calculateStatistics.getPostsQuantity();
            int usersResult = calculateStatistics.getUsersQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(100, commentsResult);
            assertEquals(10, postsResult);
            assertEquals(20, usersResult);
            assertEquals(0.5, averagePostsForUser);
            assertEquals(5, averageCommentsForUser);
            assertEquals(10, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }

        @Test
        void calculateAdvStatisticsMorePostsThanComments() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(addUsers(100));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(500);
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            int usersResult = calculateStatistics.getUsersQuantity();
            int postsResult = calculateStatistics.getPostsQuantity();
            int commentsResult = calculateStatistics.getCommentsQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(500, commentsResult);
            assertEquals(1000, postsResult);
            assertEquals(100, usersResult);
            assertEquals(10, averagePostsForUser);
            assertEquals(5, averageCommentsForUser);
            assertEquals(0.50, averageCommentsForPost);
        }

        @Test
        void calculateAdvStatisticsNoUsers() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

            //When
            int usersResult = calculateStatistics.getUsersQuantity();
            int postsResult = calculateStatistics.getPostsQuantity();
            int commentsResult = calculateStatistics.getCommentsQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(0, commentsResult);
            assertEquals(0, postsResult);
            assertEquals(0, usersResult);
            assertEquals(0, averagePostsForUser);
            assertEquals(0, averageCommentsForUser);
            assertEquals(0, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }

        @Test
        void calculateAdvStatistics100Users() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(addUsers(100));
            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(100);
            calculateStatistics.calculateAdvStatistics(statisticsMock);

            //When
            int usersResult = calculateStatistics.getUsersQuantity();
            int postsResult = calculateStatistics.getPostsQuantity();
            int commentsResult = calculateStatistics.getCommentsQuantity();
            double averagePostsForUser = calculateStatistics.getAveragePostsForUser();
            double averageCommentsForUser = calculateStatistics.getAverageCommentsForUser();
            double averageCommentsForPost = calculateStatistics.getAverageCommentsForPost();

            //Then
            assertEquals(100, commentsResult);
            assertEquals(50, postsResult);
            assertEquals(100, usersResult);
            assertEquals(0.5, averagePostsForUser);
            assertEquals(1, averageCommentsForUser);
            assertEquals(2, averageCommentsForPost);
            calculateStatistics.showStatistics();
        }
    }
}
