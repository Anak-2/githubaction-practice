/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package githubaction.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    App classUnderTest = new App();

    @Test
    void appHasAGreeting() {
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void appTesting() {
        assertNotNull(classUnderTest.testMethod(), "app should pass the test");
    }

    @DisplayName("테스트 실패")
    @Test
    void testFail() {
        assertThrows(Exception.class, () -> {
            throw new Exception("테스트 실패");
        });
    }

    @DisplayName("테스트 실패")
    @Test
    void testFail_real() throws Exception{
        throw new Exception("테스트 실패");
    }
}
