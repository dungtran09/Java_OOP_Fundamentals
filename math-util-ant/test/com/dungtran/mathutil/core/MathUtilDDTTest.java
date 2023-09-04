package com.dungtran.mathutil.core;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import static com.dungtran.mathutil.core.MathUtil.*;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
   
  @Parameterized.Parameters
  public static Object[][] initData() {
    Integer numbers[][] = new Integer[][]{
                                      {0, 1},
                                      {1, 1},
                                      {2, 2},
                                      {3, 6},
                                      {4, 24},
                                      {5, 120},
                                      {6, 720}
                                    }; 
      
    return numbers;
  }
  
  @Parameterized.Parameter(value = 0)
  public int n;

  @Parameterized.Parameter(value = 1)
  public long expected;

  @Test
  public void testFactorialGivenRightArgumetReturnWell() {
    assertEquals(getFactorial(n), expected);
  }
}
