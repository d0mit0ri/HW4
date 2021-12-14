package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.asserts.Assertion;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class TriangleTest {
    int expected = 0;
    int input1 = 0;
    int input2 = 0;
    int input3 = 0;


    /**
     * Определите, треугольник ли это,
     * Если да, то равнобедренный или равнобедренный.
     * @return      -1: Нет; 0: обычный треугольник; 1 равнобедренный треугольник; 2: равносторонний треугольник.
     */

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {-1,0,0,0},
                {-1,1,3,4},
                {1,3,3,2},
                {2,3,3,3},
                {0,4,5,3},
                {-1,3,0,-4},
                {0,5,7,3},
                {1,3,5,5}
        });
    }
    public TriangleTest(int expected, int input1, int input2, int input3){
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    @Before
    public void before(){
        System.out.println("Начало теста ----------------------");
    }

    @Test
    public void testJudgeTri(){
        assertEquals(expected, Triangle.judgeTri(input1,input2,input3));
    }

    @After
    public void afeter(){
        System.out.println("Тест окончен ----------------------");
    }

   @Test
    public void shouldTrue()
   {
       Assertions.assertDoesNotThrow(TriangleTest::t);
   }





   /**Из мавена тест не запускается, работает только если с окна запускать,
     *Так же при пуске отчета выдает Unable to locate Test Source XRef to link to - DISABLED/
     */


}
