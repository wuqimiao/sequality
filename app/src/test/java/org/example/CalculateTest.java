package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee() {
    Calculate calculate = new Calculate();
    int expected = 2000;
    assertEquals(expected, calculate.getIndividualFee(13));
  }

  @Test
  public void testGetTotalFee() {
    Calculate calculate = new Calculate();
    int expected = 9000;
    assertEquals(expected, calculate.getTotalFee(12, 10));
  }
}
