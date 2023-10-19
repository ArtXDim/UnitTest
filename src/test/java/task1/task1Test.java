package task1;

import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class task1Test {
    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @BeforeEach
    public void setup() {
        // инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // очистка ресурсов
    }

    @BeforeAll
    public void globalSetup() {
        //Инициализация
    }

    @AfterAll
    public void globalTeardown() {
        // Очистка
    }

   @Test
   @DisplayName("Тест суммирования")
   public  void testSum() {
        assertEquals(5, 2 + 3);
   }

//   @Test
//   @Disabled
//   public void testMethod() {
//        // этот текст не будет запущен
//   }

   @ParameterizedTest
   @ValueSource(ints = {1,  2, 3})
   public void testMethod(int argument) {
        assertTrue(argument > 6);
   }
}
