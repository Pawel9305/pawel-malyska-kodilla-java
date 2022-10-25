package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class CalculateStatTestSuite {

    @Nested
    @DisplayName("Tests for calculating statistics")
    class calculateStatistics {

        @Mock
        private Statistics statisticsMock;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("Beginning of statistics tests: ");

        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("Tests ending.");
        }

        @BeforeEach
        public void beforeEachTest() {
            ForumUser forumUser = new ForumUser("John", "Smith");
        }

        @Test
        void calculateAdvStatisticsNoPosts() {

        }


    }
}
